package ru.zherikhov.vladislav.utils;

import java.util.Date;

public class ConsoleLog {
    public static String getCurrentDate() {
        Date date = new Date();
        return date.toString();
    }
}
