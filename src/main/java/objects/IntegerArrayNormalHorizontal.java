package main.java.objects;

import main.java.util.Characters;
import main.java.util.Indexer;
import main.java.util.Formatter;

public class IntegerArrayNormalHorizontal extends IntegerArray {
    
    public IntegerArrayNormalHorizontal(Object object) {
        super(object);
    }

    @Override
    public String outputNotEmpty() {
        int length = integerArray.length;
        String formatter = Formatter.formatKeyIntegerArray(length);
        String indices = String.format(formatter, (Object[]) Indexer.generateIndices(length));
        String values =  String.format(formatter, (Object[]) integerArray);
        return indices + Characters.NL + values + Characters.NL;
    }

}
