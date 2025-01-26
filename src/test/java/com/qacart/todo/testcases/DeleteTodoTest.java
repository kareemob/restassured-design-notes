package com.qacart.todo.testcases;

import com.qacart.todo.client.TodoClient;
import com.qacart.todo.client.UserClient;
import com.qacart.todo.fixtures.TodoFixture;
import com.qacart.todo.fixtures.UserFixture;
import com.qacart.todo.models.Todo;
import com.qacart.todo.models.User;
import com.qacart.todo.setps.TodoSteps;
import com.qacart.todo.setps.UserSteps;
import com.qacart.todo.utils.DataUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Instant;


public class DeleteTodoTest {
    @Test
    void shouldBeAbleToDeleteTodo(){
        //Register new user
        User user = UserFixture.generateUser();
        String token = UserSteps.registerUser(user);
        //Create new task
        Todo newTodo = TodoFixture.generateTodo();
        String todoId = TodoSteps.createTodo(newTodo,token);
        //Delete task
        Response deletedTodo = TodoClient.deleteTask(token, todoId);
        Assert.assertEquals(deletedTodo.statusCode(), 200);
    }
}
