package controllers;

import play.data.Form;
import play.data.FormFactory;
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



    public Result q11Handler(){
        Form<Paper> q11Form = formFactory.form(Paper.class).bindFromRequest();
        if (q11Form.get().getTitle() == null){
            return ok(views.html.q11.render("Test Message for q11"));
        }
        else{
            System.out.println(q11Form.get().checkPaper().toString());
            return ok(views.html.q11.render(q11Form.get().getTitle()));
        }
    }

}