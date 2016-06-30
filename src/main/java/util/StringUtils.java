package main.java.util;

public class StringUtils {
    
    public static String nCharacters(String sequence, int n) {
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < n; i++) {
            string.append(sequence);
        }
        return string.toString();
    }

}
