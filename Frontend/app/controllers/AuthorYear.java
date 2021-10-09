package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.util.concurrent.CompletionStage;

public class AuthorYear {

    private String name;
    private String year;

    public String getName(){return this.name;}
    public String getYear(){return this.year;}

    public CompletionStage<WSResponse> checkAuthorYear() {
        System.out.println("Check Author Function");

        WSClient ws = play.test.WSTestClient.newClient(9005);
        WSRequest request = ws.url("http://localhost:9005/authoryear");
        ObjectNode res = Json.newObject();
        res.put("name", this.name);
        res.put("year", this.year);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }



}
