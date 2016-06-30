package main.java.objects;

import main.java.util.Characters;
import main.java.util.Formatter;
import main.java.util.StringUtils;

public class IntegerArrayFancyVertical extends IntegerArray {
    
    public IntegerArrayFancyVertical(Object object) {
        super(object);
    }

    @Override
    public String outputNotEmpty() {
        int length = integerArray.length;
        int horizontalLength = 32;
        String formatter = Formatter.formatKeyIntegerArrayFancyVertical(length);
        Integer[] interweavedArray = interweave(integerArray);
        String border = StringUtils.nCharacters(Characters.BORDER, horizontalLength);
        String output = String.format(formatter, (Object[]) interweavedArray);
        return border + Characters.NL
             + output
             + border + Characters.NL;
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
