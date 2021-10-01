package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Authors;
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
                res.put("Title", paper.title);
                res.put("Conference", paper.book_title);
                res.put("Publisher", paper.publisher);
                res.put("Year",paper.year);
                res.put("Journal", paper.journal);
                res.put("Volume", paper.volume);
                res.put("Number", paper.number);
                res.put("Pages", paper.pages);
                res.put("URL", paper.url);
                res.put("EE", paper.ee);
                res.put("CrossRef",paper.crossref);
                res.put("ISBN",paper.isbn);

                String authorString = "";
                for(Authors a: paper.authors){

                    authorString += a.author_name + ",";

                }

                res.put("Authors",authorString);

                return ok(res);
            }else{
                return ok(res);
            }
        }
        catch (Exception e) {
            return ok(res);
        }

    }

}
