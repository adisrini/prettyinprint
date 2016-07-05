package main.java.objects;

import main.java.util.Characters;
import main.java.util.Formatter;
import main.java.util.Indexer;
import main.java.util.StringUtils;

public class IntegerArray extends PrintableArray {

    private Integer[] integerArray;
    
    public IntegerArray(Object object) {
        super(object);
        integerArray = (Integer[]) object;
    }

    @Override
    public boolean isEmpty() {
        for(Integer i : integerArray) {
            if(i != null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String outputNormalHorizontal() {
        int length = integerArray.length;
        String formatter = Formatter.formatKeyIntegerArray(length);
        String indices = String.format(formatter, (Object[]) Indexer.generateIndices(length));
        String values =  String.format(formatter, (Object[]) integerArray);
        return indices + Characters.NL + values + Characters.NL;
    }

    @Override
    public String outputNormalVertical() {
        int length = integerArray.length;
        String formatter = Formatter.formatKeyIntegerArrayVertical(length);
        Integer[] interweavedArray = interweave(integerArray);
        String output = String.format(formatter, (Object[]) interweavedArray);
        return output;
    }
    
    @Override
    public String outputFancyHorizontal() {
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
    
    @Override
    public String outputFancyVertical() {
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

}
