package tasks;

import java.util.regex.Pattern;

public class Task3 {
    public static String compression(String text){
        if (null == text) {
            return null;
        }

        return Pattern.compile("(\\w{1})\\1*")
                .matcher(text).replaceAll(match -> grouping(match.group()));
    }

    public static String grouping(String text){
        return (text.length() == 1) ? text : Integer.toString(text.length()) + text.charAt(0);
    }
}


