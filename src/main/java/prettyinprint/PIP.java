package main.java.prettyinprint;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import main.java.util.Formatter;

public class PIP {

    private static Decoration decoration;
    private static Orientation orientation;
    
    static {
        decoration = Decoration.NORMAL;
        orientation = Orientation.HORIZONTAL;
    }

    public static String print(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Class<?> clazz;
        try {
            clazz = Class.forName("main.java.objects." + Formatter.className(simpleName));
            Constructor<?> constructor = clazz.getDeclaredConstructor(Object.class);
            PrintableObject po = (PrintableObject) constructor.newInstance(obj);
            String output = "";
            if(!po.isEmpty()) {
                Method method = clazz.getDeclaredMethod("output" + decoration.suffix() + orientation.suffix());
                output = (String) method.invoke(po);
                System.out.println(output);
            } else {
                System.out.println("Empty.");
            }
            return output;
        } catch(Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    
    public static String print(Object obj, Decoration d) {
        decoration = d;
        return print(obj);
    }

    public static String print(Object obj, Orientation o) {
        orientation = o;
        return print(obj);
    }

    public static String print(Object obj, Decoration d, Orientation o) {
        decoration = d;
        orientation = o;
        return print(obj);
    }

    public static void setDecoration(Decoration d) {
        decoration = d;
    }
    
    public static void setOrientation(Orientation o) {
        orientation = o;
    }

}
