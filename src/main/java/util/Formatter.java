package main.java.util;

public class Formatter {
    
    public static String className(String simpleName) {
        String className = simpleName.replace("[]", "Array");
        return className;
    }

    public static String formatKeyIntegerArray(int length) {
        StringBuilder format = new StringBuilder();
        for(int i = 0; i < length; i++) {
            format.append("%12d");
        }
        return format.toString();
    }
    
    public static String formatKeyIntegerArrayFancy(int length) {
        StringBuilder format = new StringBuilder();
        for(int i = 0; i < length; i++) {
            format.append("%12d |");
        }
        return format.toString();
    }
    
    public static String formatKeyIntegerArrayVertical(int length) {
        StringBuilder format = new StringBuilder();
        for(int i = 0; i < length; i++) {
            format.append("%12d%12d\n");
        }
        return format.toString();
    }
    
    public static String formatKeyIntegerArrayFancyVertical(int length) {
        StringBuilder format = new StringBuilder();
        for(int i = 0; i < length; i++) {
            format.append(Characters.BORDER + Characters.BORDER + "%12d |%12d |" + Characters.BORDER + Characters.BORDER + "\n");
        }
        return format.toString();
    }

}
