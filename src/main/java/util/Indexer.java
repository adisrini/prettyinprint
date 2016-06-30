package main.java.util;

public class Indexer {
    
    public static Integer[] generateIndices(int length) {
        Integer[] indices = new Integer[length];
        for(int i = 0; i < length; i++) {
            indices[i] = i;
        }
        return indices;
    }

}
