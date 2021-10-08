package controllers;

import com.avaje.ebean.SqlRow;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Authors;
import models.Papers;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

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


    public Result journalSearch(){

        JsonNode req = request().body().asJson();
        ObjectNode res = Json.newObject();
        String title = req.get("title").asText();
        String volume = req.get("volume").asText();
        String issue = req.get("issue").asText();

        System.out.println("Here");


        List<SqlRow> papers = Papers.findByJournal(title,volume,issue);
        for(SqlRow row: papers){
            ObjectNode paperInfo = Json.newObject();
            paperInfo.put("Conference", (String) row.get("book_title"));
            paperInfo.put("Publisher", (String) row.get("publisher"));
            paperInfo.put("Year",(String) row.get("year"));
            paperInfo.put("Journal",(String) row.get("journal"));
            paperInfo.put("Volume", (String) row.get("volume"));
            paperInfo.put("Number", (String) row.get("number"));
            paperInfo.put("Pages", (String) row.get("pages"));
            paperInfo.put("URL", (String) row.get("url"));
            paperInfo.put("EE", (String) row.get("ee"));
            paperInfo.put("CrossRef",(String) row.get("crossref"));
            paperInfo.put("ISBN",(String) row.get("isbn"));

            res.put((String) row.get("title"),paperInfo);

        }
        // System.out.println(papers.get("title"));

        return ok(res);

    }

}
