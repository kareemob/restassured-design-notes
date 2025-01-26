package com.qacart.todo.setps;

import com.qacart.todo.client.TodoClient;
import com.qacart.todo.models.Todo;
import io.restassured.response.Response;
import org.testng.Assert;

public final class TodoSteps {
    private TodoSteps(){}

    public static String createTodo(Todo todo, String token){
        Response response = TodoClient.addTask(token, todo);
        Assert.assertEquals(response.statusCode(), 201);
        Todo returnedTodo = response.body().as(Todo.class);
        return returnedTodo.getId();
    }
}
