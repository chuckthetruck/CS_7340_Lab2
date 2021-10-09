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
        return ok(views.html.q15.render("testing 123"));
    }

    public Result query21(){return ok(views.html.q21.render(""));}
    public Result q21Handler(){
        return ok(views.html.q21.render("testing 123"));
    }

    public Result query22(){return ok(views.html.q22.render(""));}
    public Result q22Handler(){
        return ok(views.html.q22.render("testing 123"));
    }

    public Result query23(){return ok(views.html.q23.render(""));}
    public Result q23Handler(){
        return ok(views.html.q23.render("testing 123"));
    }

}