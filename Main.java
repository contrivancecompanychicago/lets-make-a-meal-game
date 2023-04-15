package com.gupsy;

import java.lang;
import com.squareup.okhttp.*;

class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient().newBuilder().build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n    \"collection\":\"krebsville_MapBox\",\n    \"database\":\"Games\",\n    \"dataSource\":\"Cluster0\",\n    \"projection\": {\"_id\": 1}\n\n}");
        Request request = new Request.Builder()
          .url("https://data.mongodb-api.com/app/data-pitmi/endpoint/data/v1/action/findOne")
          .method("POST", body)
          .addHeader("Content-Type", "application/json")
          .addHeader("Access-Control-Request-Headers", "*")
          .addHeader("api-key", "<API_KEY>")
          .addHeader("Accept", "application/ejson")
          .build();
        Response response = client.newCall(request).execute();
    }
}
