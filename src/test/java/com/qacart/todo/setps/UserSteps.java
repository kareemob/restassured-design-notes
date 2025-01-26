package com.qacart.todo.setps;

import com.qacart.todo.client.UserClient;
import com.qacart.todo.models.User;
import io.restassured.response.Response;

public final class UserSteps {
    private UserSteps(){}

    public static String registerUser(User user){
        Response response = UserClient.RegisterApi(user);
        User returnedUser = response.body().as(User.class);
        return returnedUser.getAccessToken();
    }
}
