package com.qacart.todo.utils;

import java.time.Instant;

public final class DataUtils {
    private DataUtils(){}

    public static String generateUniqueEmail(){
        return Instant.now().toEpochMilli() + "auto@gmail.jo";
    }
}
