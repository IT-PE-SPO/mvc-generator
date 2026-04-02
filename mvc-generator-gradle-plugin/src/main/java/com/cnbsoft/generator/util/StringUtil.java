package com.cnbsoft.generator.util;

public class StringUtil {

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toTitleCase(str.charAt(0)) +
                str.substring(1);
    }

    public static String toTitleCase(String str) {
        String[] strs = str.replace("_", " ").split(" ");
        StringBuilder buffer = new StringBuilder();
        for (String s : strs) {
            buffer.append(Character.toTitleCase(s.charAt(0)))
                    .append(s.substring(1).toLowerCase());
        }
        return buffer.toString();
    }

    public static String tableNameToJavaName(String source) {
        return capitalize(toTitleCase(source));
    }

    public static String toFirstLower(String str) {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}
