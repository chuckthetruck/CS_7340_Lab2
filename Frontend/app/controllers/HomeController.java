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