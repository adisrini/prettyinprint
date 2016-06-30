package main.java.objects;

import main.java.util.Characters;
import main.java.util.Indexer;
import main.java.util.Formatter;

public class IntegerArrayNormalVertical extends IntegerArray {
    
    public IntegerArrayNormalVertical(Object object) {
        super(object);
    }

    @Override
    public String outputNotEmpty() {
        int length = integerArray.length;
        String formatter = Formatter.formatKeyIntegerArrayVertical(length);
        Integer[] interweavedArray = interweave(integerArray);
        String output = String.format(formatter, (Object[]) interweavedArray);
        return output;
    }
    
    private Integer[] interweave(Integer[] array) {
        Integer[] interweaved = new Integer[array.length*2];
        for(int i = 0; i < array.length; i++) {
            interweaved[2*i] = i;
            interweaved[2*i + 1] = array[i];
        }
        return interweaved;
    }

}
