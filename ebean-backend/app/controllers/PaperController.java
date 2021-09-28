package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Papers;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class PaperController extends Controller {

    public Result paperSearch() {
        JsonNode req = request().body().asJson();
        String title = req.get("title").asText();
        ObjectNode res = Json.newObject();
        try {
            Papers paper = Papers.findByName(title); // ( match where username and password both match )
            if(paper!=null){
                res.put("journal", paper.journal);
                return ok(res);
            }else{
                return ok("No Result");
            }
        }
        catch (Exception e) {
            return ok("No Result");
        }

    }

}
