package main.java.objects;

import main.java.prettyinprint.PrintableObject;

public abstract class IntegerArray extends PrintableObject {

    protected Integer[] integerArray;
    
    public IntegerArray(Object object) {
        super(object);
        integerArray = (Integer[]) object;
    }

    @Override
    public String output() {
        boolean empty = true;
        for(Integer i : integerArray) {
            if(i != null) {
                empty = false;
            }
        }
        if(empty) {
            return "Empty.";
        } else {
            return outputNotEmpty();
        }
    }
    
    protected abstract String outputNotEmpty();

}
