package com.qacart.todo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("userID")
    private String userId;

}
