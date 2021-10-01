package controllers;

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
import java.util.concurrent.CompletionStage;

/**
 * Software Service Market Place
 */
public class HomeController extends Controller {

    @Inject
    HttpExecutionContext ec;

    private FormFactory formFactory;

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
        ObjectNode response = Json.newObject();
        if (q11Form.get().getTitle() == null){
            return (CompletionStage<Result>) ok(q11.render("Test Message for q11"));
        }
        return q11Form.get().checkPaper().thenApplyAsync((WSResponse r)->{

                if (r.getStatus() == 200 && r.asJson() != null) {
                    return ok(views.html.q11.render(r.asJson().toString()));
                }
                else{
                    return ok(views.html.q11.render("No Title By That name"));
                }

        });
    }

}