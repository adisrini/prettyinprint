package test.java.util;

import java.util.Random;

public class TestData {
    
    private static Random r;
    
    private static final int COUNT_BOUND = 90;
    private static final int COUNT_SHIFT = 10;
    
    static {
        r = new Random();
    }
    
    public static int getCount() {
        return r.nextInt(COUNT_BOUND) + COUNT_SHIFT;
    }

    public static Integer getInteger() {
        return r.nextInt();
    }

}
