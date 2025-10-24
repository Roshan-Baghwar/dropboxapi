package com.cloudeagle.dropboxapi.service;

import okhttp3.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DropboxService {

    @Value("${dropbox.access.token}")
    private String accessToken;

    private static final String API_URL = "https://api.dropboxapi.com/2/team/members/list_v2";
    private final OkHttpClient client = new OkHttpClient();

    public String getTeamMembers() {
        try {
            RequestBody body = RequestBody.create("{}", MediaType.get("application/json"));
            Request request = new Request.Builder()
                    .url(API_URL)
                    .post(body)
                    .addHeader("Authorization", "Bearer " + accessToken)
                    .addHeader("Content-Type", "application/json")
                    .build();

            Response response = client.newCall(request).execute();
            String responseBody = response.body().string();

            return new JSONObject(responseBody).toString(2);

        } catch (Exception e) {
            e.printStackTrace();
            return "Error: " + e.getMessage();
        }
    }
}