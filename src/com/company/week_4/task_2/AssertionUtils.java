package com.company.week_4.task_2;

public class AssertionUtils {
    static void assertEquals(int val1, int val2) {
        if (val1 != val2) {
            throw new RuntimeException("values are not equal");
        }
    }

    static void assertEquals(double val1, double val2) {
        if (val1 != val2) {
            throw new RuntimeException("values are not equal");
        }
    }

    static void assertEquals(String val1, String val2) {
        if (!val1.equals(val2)) {
            throw new RuntimeException("values are not equal");
        }
    }

    static void assertEquals(boolean val1, boolean val2) {
        if (val1 != val2) {
            throw new RuntimeException("values are not equal");
        }
    }

    static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Object can not be null");
        }
    }
}
