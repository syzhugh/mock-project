package com.sunladder.mock.utils;

public final class TextUtils {

    public static boolean isEmpty(String str) {
        return str != null && !str.equals("");
    }

    public static boolean isSameString(String s1, String s2) {
        if (s1 != null) {
            return s1.equals(s2);
        } else {
            return false;
        }
    }
}
