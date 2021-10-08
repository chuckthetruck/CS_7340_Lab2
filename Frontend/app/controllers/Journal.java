package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Journal {

    private String title;
    private String volume;
    private String issue;

    public String getTitle(){return this.title;}
    public String getVolume(){return this.volume;}
    public String getIssue(){return this.issue;}

    public CompletionStage<WSResponse> checkJournal() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/journal");
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        res.put("volume", this.volume);
        res.put("issue", this.issue);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }


}
