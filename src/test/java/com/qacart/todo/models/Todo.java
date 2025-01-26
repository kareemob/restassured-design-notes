package com.qacart.todo.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class Todo {
    private String item;
    private Boolean isCompleted;

    private String createdAt;
    private String userID;
    @JsonProperty("__v")
    private int v;
    @JsonProperty("_id")
    private String id;
    private String message;
}
