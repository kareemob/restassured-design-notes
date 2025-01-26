package com.qacart.todo.client;

import com.qacart.todo.base.BaseClient;
import com.qacart.todo.models.Todo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public final class TodoClient {
    private TodoClient(){}

    public static Response addTask(String token, Todo todo){

        return
                BaseClient.getAuthRequestSpec(token)
                        .body(todo)
                        .when()
                        .post("/tasks");
    }

    public static Response deleteTask(String token, String taskId){
        return
                BaseClient.getAuthRequestSpec(token)
                        .when().delete("/tasks/" + taskId);
    }
}
