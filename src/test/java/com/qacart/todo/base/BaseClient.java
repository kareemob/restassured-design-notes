package com.qacart.todo.base;

import com.qacart.todo.config.ConfigFactory;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class BaseClient {
    private  BaseClient(){}

    public static RequestSpecification getRequestSpec(){
        return
                given()
                        .baseUri(ConfigFactory.getConfig().Url())
                        .contentType(ContentType.JSON);

    }

    public static RequestSpecification getAuthRequestSpec(String token){
        return
                getRequestSpec().auth().oauth2(token);


    }
}
