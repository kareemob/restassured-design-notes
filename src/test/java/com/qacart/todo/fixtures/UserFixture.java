package com.qacart.todo.fixtures;

import com.qacart.todo.models.User;
import com.qacart.todo.utils.DataUtils;

public final class UserFixture {
    private UserFixture(){}

    public static User generateUser(){
        return User.builder()
                .firstName("Kareem")
                .lastName("Obaidat")
                .email(DataUtils.generateUniqueEmail())
                .password("Test123!")
                .build();
    }
}
