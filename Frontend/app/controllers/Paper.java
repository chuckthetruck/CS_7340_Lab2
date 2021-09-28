package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class Paper {
    private String title;

    public String getTitle() {
        return this.title;
    }


    public CompletionStage<WSResponse> checkPaper() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/paper");
        ObjectNode res = Json.newObject();
        res.put("title", this.title);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

}
