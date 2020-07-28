package com.kodilla;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class TrelloData {
    public static void main(String[] args) {
// This code sample uses the  'Unirest' library:
// http://unirest.io/java.html
        HttpResponse<JsonNode> response = Unirest.get("https://api.trello.com/1/members/me/boards")
                .header("Accept", "application/json")
                .queryString("key", "bd7f0175c147dc9fd6c3ad88e24dcdcf")
                .queryString("token", "8c0a91a518c51721728f39c19da434033d7d60f6a754b2019f5135b699f044ec")
                .asJson();

        System.out.println(response.getBody());
    }
}
