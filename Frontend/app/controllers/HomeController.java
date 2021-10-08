package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.libs.concurrent.HttpExecutionContext;
import play.libs.ws.WSResponse;
import play.twirl.api.Html;
import views.html.*;

import javax.inject.Inject;
import java.util.Iterator;
import java.util.Vector;
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

    public Result query12(){return ok(views.html.q12.render(""));}
    public Result q12Handler(){
        return ok(views.html.q12.render("testing 123"));
    }

    public Result query13(){return ok(views.html.q13.render(""));}
    public Result q13Handler(){
        return ok(views.html.q13.render("testing 123"));
    }

    public Result query14(){return ok(views.html.q14.render(""));}
    public Result q14Handler(){
        return ok(views.html.q14.render("testing 123"));
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