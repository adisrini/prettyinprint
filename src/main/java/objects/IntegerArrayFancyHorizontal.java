package main.java.objects;

import main.java.util.Characters;
import main.java.util.Indexer;
import main.java.util.Formatter;
import main.java.util.StringUtils;

public class IntegerArrayFancyHorizontal extends IntegerArray {
    
    public IntegerArrayFancyHorizontal(Object object) {
        super(object);
    }

    @Override
    public String outputNotEmpty() {
        int length = integerArray.length;
        int horizontalLength = integerArray.length * 14 + 4;
        String formatter = Formatter.formatKeyIntegerArrayFancy(length);
        String border = StringUtils.nCharacters(Characters.BORDER, horizontalLength);
        String divider = StringUtils.nCharacters(Characters.DASH, horizontalLength - 4);
        String indices = String.format(formatter, (Object[]) Indexer.generateIndices(length));
        String values =  String.format(formatter, (Object[]) integerArray);
        String block = Characters.BORDER + Characters.BORDER;
        return border + Characters.NL 
             + block + indices + block + Characters.NL 
             + block + divider + block + Characters.NL
             + block + values  + block + Characters.NL 
             + border + Characters.NL;
    }

}
