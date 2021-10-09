package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;
import java.util.concurrent.CompletionStage;

//public class Vector<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
public class Conference {

    public String conference;
    public String year;
    public String year1;
    public String year2;

    public String getConference() {
        return this.conference;
    }
    public String getYear() {
        return this.year;
    }
    public String getYear1() {
        return this.year1;
    }
    public String getYear2() {
        return this.year2;
    }

    public CompletionStage<WSResponse> checkConference() {

        WSClient ws = play.test.WSTestClient.newClient(9005);
        //add username password
        WSRequest request = ws.url("http://localhost:9005/paper");
        ObjectNode res = Json.newObject();
        res.put("conference", this.conference);
        return request.addHeader("Content-Type", "application/json")
                .post(res)
                .thenApply((WSResponse r) -> {
                    return r;
                });
    }

    public Vector<Integer> calculateRange(int year1, int year2)
    {
        Vector<Integer> v = new Vector<Integer>(20);
        for (int i = year1; i <= year2; i++)
        {
            v.add(i);
        }
        return v;
    }
}
