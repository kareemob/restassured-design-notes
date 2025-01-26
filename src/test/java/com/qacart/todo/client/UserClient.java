package com.qacart.todo.client;

import com.qacart.todo.base.BaseClient;
import com.qacart.todo.models.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.time.Instant;

import static io.restassured.RestAssured.given;

public final class UserClient {
    private UserClient(){}

    public static Response RegisterApi(User user){
        return
                BaseClient.getRequestSpec()
                        .body(user)
                        .when().post("/users/register");

    }
}
