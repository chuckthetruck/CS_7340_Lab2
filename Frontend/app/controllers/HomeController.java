package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import views.html.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;
    private Iterator it;


    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    /**
     * Index page
     */
    public Result index() {
        return ok(views.html.login.render(""));
    }


    public Result query11(){return ok(views.html.q11.render(""));}
    public CompletionStage<Result> q11Handler(){
        Form<Paper> q11Form = formFactory.form(Paper.class).bindFromRequest();
        if (q11Form.get().getTitle() == null){
            return (CompletionStage<Result>) ok(q11.render("Test Message for q11"));
        }
        return q11Form.get().checkPaper().thenApplyAsync((WSResponse r)->{

                if (r.getStatus() == 200 && r.asJson() != null) {

                    String outString = "";

                    JsonNode response = r.asJson();

                    Iterator it = response.fieldNames();
                    System.out.println(response.fields());

                    while(it.hasNext()){
                        String key = it.next().toString();
                        JsonNode value = response.get(key);
                        System.out.println(value.toString());
                        if(value.toString() != "null"){
                            outString += key +":\t" + value + "\n";
                        }
                    }


                    return ok(views.html.q11.render(outString));
                }
                else{
                    return ok(views.html.q11.render("No Title By That name"));
                }

        });

    }

    public Result query12(){return ok(views.html.q12.render(new ArrayList<List<String>>()));}
    public CompletionStage<Result> q12Handler(){
        Form<Journal> q12Form = formFactory.form(Journal.class).bindFromRequest();

        List<List<String>> nullList = new ArrayList<List<String>>();

        if (q12Form.get().getTitle() == null){
            System.out.println("Test return in q12");
            return (CompletionStage<Result>) ok(q12.render(new ArrayList<List<String>>()));
        }

        return q12Form.get().checkJournal().thenApplyAsync((WSResponse r)->{
            if (r.getStatus() == 200 && r.asJson() != null) {

                List<List<String>> outList = new ArrayList<List<String>>();

                JsonNode response = r.asJson();
                Iterator it = response.fieldNames();
                while(it.hasNext()){
                    List<String> paperList = new ArrayList<String>();
                    String papertitle = it.next().toString();

                    JsonNode paperInfo = response.get(papertitle);

                    paperList.add(papertitle);
                    paperList.add(paperInfo.get("Conference").toString());
                    paperList.add(paperInfo.get("Publisher").toString());
                    paperList.add(paperInfo.get("Year").toString());
                    paperList.add(paperInfo.get("Journal").toString());
                    paperList.add(paperInfo.get("Volume").toString());
                    paperList.add(paperInfo.get("Number").toString());
                    paperList.add(paperInfo.get("Pages").toString());
                    paperList.add(paperInfo.get("URL").toString());
                    paperList.add(paperInfo.get("EE").toString());
                    paperList.add(paperInfo.get("CrossRef").toString());
                    paperList.add(paperInfo.get("ISBN").toString());

                    outList.add(paperList);

                }

                return ok(views.html.q12.render(outList));

            }else {
                return ok(views.html.q12.render(nullList));
            }
        });

    }

    public Result query13(){return ok(views.html.q13.render(new ArrayList<List<String>>()));}
    public Result q13Handler(){

        Form<AuthorYear> q13Form = formFactory.form(AuthorYear.class).bindFromRequest();
        CompletionStage<WSResponse> test =  q13Form.get().checkAuthorYear();
        return ok(views.html.q13.render(new ArrayList<List<String>>()));

       /*List<List<String>> nullList = new ArrayList<List<String>>();

        if (q13Form.get().getName() == null){
            return (CompletionStage<Result>) ok(views.html.q13.render(new ArrayList<List<String>>()));
        }

        return q13Form.get().checkAuthorYear().thenApplyAsync((WSResponse r)->{
            if (r.getStatus() == 200 && r.asJson() != null) {

                List<List<String>> outList = new ArrayList<List<String>>();

                JsonNode response = r.asJson();
                Iterator it = response.fieldNames();
                while(it.hasNext()){
                    List<String> paperList = new ArrayList<String>();
                    String papertitle = it.next().toString();

                    JsonNode paperInfo = response.get(papertitle);

                    paperList.add(papertitle);
                    paperList.add(paperInfo.get("Conference").toString());
                    paperList.add(paperInfo.get("Publisher").toString());
                    paperList.add(paperInfo.get("Year").toString());
                    paperList.add(paperInfo.get("Journal").toString());
                    paperList.add(paperInfo.get("Volume").toString());
                    paperList.add(paperInfo.get("Number").toString());
                    paperList.add(paperInfo.get("Pages").toString());
                    paperList.add(paperInfo.get("URL").toString());
                    paperList.add(paperInfo.get("EE").toString());
                    paperList.add(paperInfo.get("CrossRef").toString());
                    paperList.add(paperInfo.get("ISBN").toString());

                    outList.add(paperList);

                }

                return ok(views.html.q13.render(outList));

            }else {
                return ok(views.html.q13.render(nullList));
            }
        });*/
    }

    public Result query14(){return ok(views.html.q14.render(""));}
    public Result q14Handler(){
        CompletionStage<WSResponse> test = ProductiveAuthors.getProdAuthors();
        System.out.println();
        return ok(q14.render("This Didn't Worked"));

        /*return ProductiveAuthors.getProdAuthors().thenApplyAsync((WSResponse r)-> {
            if (r.getStatus() == 200 && r.asJson() != null) {
                List<List<String>> outList = new ArrayList<List<String>>();
                JsonNode response = r.asJson();
                Iterator it = response.fieldNames();
                while(it.hasNext()){
                    List<String> authorList = new ArrayList<String>();
                    String authorName = it.next().toString();
                    authorList.add(authorName);
                    authorList.add(response.get(authorName).toString());
                }

                return ok(views.html.q14.render("This Worked"));

            }
            return ok(views.html.q14.render("This Didn't Worked"));
        });*/
    }

    public Result query15(){return ok(views.html.q15.render(""));}
    public Result q15Handler(){
        Form<Conference> q15Form = formFactory.form(Conference.class).bindFromRequest();
        if (q15Form.get().conference.equals("ICWS"))
        {
            if (q15Form.get().year.isEmpty())
            {
                return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
            }
            if ((Integer.parseInt(q15Form.get().year) > 2002) && (Integer.parseInt(q15Form.get().year)  < 2021))
            {
                if (Integer.parseInt(q15Form.get().year) == 2003)
                    return ok(views.html.q15.render("Las Vegas, Nevada"));
                else if (Integer.parseInt(q15Form.get().year) == 2004)
                    return ok(views.html.q15.render("San Diego, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2005)
                    return ok(views.html.q15.render("Orlando, Florida"));
                else if (Integer.parseInt(q15Form.get().year) == 2006)
                    return ok(views.html.q15.render("Chicago, Illinois"));
                else if (Integer.parseInt(q15Form.get().year) == 2007)
                    return ok(views.html.q15.render("Salt Lake City, Utah"));
                else if (Integer.parseInt(q15Form.get().year) == 2008)
                    return ok(views.html.q15.render("Beijing, China"));
                else if (Integer.parseInt(q15Form.get().year) == 2009)
                    return ok(views.html.q15.render("Los Angeles, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2010)
                    return ok(views.html.q15.render("Miami, Florida"));
                else if (Integer.parseInt(q15Form.get().year) == 2011)
                    return ok(views.html.q15.render("Washington, DC"));
                else if (Integer.parseInt(q15Form.get().year) == 2012)
                    return ok(views.html.q15.render("Honolulu, Hawaii"));
                else if (Integer.parseInt(q15Form.get().year) == 2013)
                    return ok(views.html.q15.render("Santa Clara, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2014)
                    return ok(views.html.q15.render("Anchorage, Alaska"));
                else if (Integer.parseInt(q15Form.get().year) == 2015)
                    return ok(views.html.q15.render("New York, New York"));
                else if (Integer.parseInt(q15Form.get().year) == 2016)
                    return ok(views.html.q15.render("San Francisco, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2017)
                    return ok(views.html.q15.render("Honolulu, Hawaii"));
                else if (Integer.parseInt(q15Form.get().year) == 2018)
                    return ok(views.html.q15.render("San Francisco, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2019)
                    return ok(views.html.q15.render("Milan, Italy"));
                else if (Integer.parseInt(q15Form.get().year) == 2020)
                    return ok(views.html.q15.render("Beijing, China"));
                else
                    return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
            }
            else
                return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
        }
        else if (q15Form.get().conference.equals("SCC"))
        {
            if (q15Form.get().year.isEmpty())
            {
                return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
            }
            if ((Integer.parseInt(q15Form.get().year) > 2002) && (Integer.parseInt(q15Form.get().year)  < 2021))
            {
                if (Integer.parseInt(q15Form.get().year) == 2003)
                    return ok(views.html.q15.render("Las Vegas, Nevada"));
                else if (Integer.parseInt(q15Form.get().year) == 2004)
                    return ok(views.html.q15.render("San Diego, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2005)
                    return ok(views.html.q15.render("Orlando, Florida"));
                else if (Integer.parseInt(q15Form.get().year) == 2006)
                    return ok(views.html.q15.render("Chicago, Illinois"));
                else if (Integer.parseInt(q15Form.get().year) == 2007)
                    return ok(views.html.q15.render("Salt Lake City, Utah"));
                else if (Integer.parseInt(q15Form.get().year) == 2008)
                    return ok(views.html.q15.render("Beijing, China"));
                else if (Integer.parseInt(q15Form.get().year) == 2009)
                    return ok(views.html.q15.render("Bangalore, India"));
                else if (Integer.parseInt(q15Form.get().year) == 2010)
                    return ok(views.html.q15.render("Miami, Florida"));
                else if (Integer.parseInt(q15Form.get().year) == 2011)
                    return ok(views.html.q15.render("Washington, DC"));
                else if (Integer.parseInt(q15Form.get().year) == 2012)
                    return ok(views.html.q15.render("Honolulu, Hawaii"));
                else if (Integer.parseInt(q15Form.get().year) == 2013)
                    return ok(views.html.q15.render("Santa Clara, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2014)
                    return ok(views.html.q15.render("Anchorage, Alaska"));
                else if (Integer.parseInt(q15Form.get().year) == 2015)
                    return ok(views.html.q15.render("New York, New York"));
                else if (Integer.parseInt(q15Form.get().year) == 2016)
                    return ok(views.html.q15.render("San Francisco, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2017)
                    return ok(views.html.q15.render("Honolulu, Hawaii"));
                else if (Integer.parseInt(q15Form.get().year) == 2018)
                    return ok(views.html.q15.render("San Francisco, California"));
                else if (Integer.parseInt(q15Form.get().year) == 2019)
                    return ok(views.html.q15.render("Milan, Italy"));
                else if (Integer.parseInt(q15Form.get().year) == 2020)
                    return ok(views.html.q15.render("Beijing, China"));
                else
                    return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
            }
            else
                return ok(views.html.q15.render("Please Input valid year between 2003 - 2020"));
        }
        else
            return ok(views.html.q15.render("Please input valid Conference"));
    }

    public Result query21(){return ok(views.html.q21.render(""));}
    public Result q21Handler(){
        return ok(views.html.q21.render("testing 123"));
    }

    public Result query22(){return ok(views.html.q22.render(""));}
    public Result q22Handler(){
        return ok(views.html.q22.render("testing 123"));
    }

    public Result query23(){return ok(views.html.q23.render("",0,0,"ICWS"));}
    public Result q23Handler(){
        Form<Conference> q23Form = formFactory.form(Conference.class).bindFromRequest();
        if (q23Form.get().conference.equals("ICWS"))
        {
            if (q23Form.get().year1.isEmpty())
            {
                return ok(views.html.q23.render("Please Input valid Year Range 2003-2020", 0, 0, "ICWS"));
            }
            if (q23Form.get().year2.isEmpty())
            {
                return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",0,0, "ICWS"));
            }
            else
            {
                Conference c = new Conference();
                int y1 = Integer.parseInt(q23Form.get().year1);
                int y2 = Integer.parseInt(q23Form.get().year2);
                String conf = q23Form.get().conference;
                Vector<Integer> v = c.calculateRange(y1, y2);
                return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",y1,y2,"ICWS"));
            }
        }
        else if (q23Form.get().conference.equals("SCC"))
        {
            if (q23Form.get().year1.isEmpty())
            {
                return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",0,0, "SCC"));
            }
            if (q23Form.get().year2.isEmpty())
            {
                return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",0,0,"SCC"));
            }
            else
            {
                if (Integer.parseInt(q23Form.get().year2) > 2020)
                    return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",0,0,"SCC"));
                else if (Integer.parseInt(q23Form.get().year1) < 2003)
                    return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",0,0,"SCC"));
                else
                {
                    Conference c = new Conference();
                    int y1 = Integer.parseInt(q23Form.get().year1);
                    int y2 = Integer.parseInt(q23Form.get().year2);
                    String conf = q23Form.get().conference;
                    Vector<Integer> v = c.calculateRange(y1, y2);
                    return ok(views.html.q23.render("Please Input valid Year Range 2003-2020",y1,y2,"SCC"));
                }
            }
        }
        else
            return ok(views.html.q23.render("Please Input valid Conference, ICWS or SCC",0,0,"ICWS"));
    }

}