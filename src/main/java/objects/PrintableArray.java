package main.java.objects;

import main.java.prettyinprint.PrintableObject;

public abstract class PrintableArray extends PrintableObject {
    
    public PrintableArray(Object object) {
        super(object);
    }

    protected Integer[] interweave(Integer[] array) {
        Integer[] interweaved = new Integer[array.length*2];
        for(int i = 0; i < array.length; i++) {
            interweaved[2*i] = i;
            interweaved[2*i + 1] = array[i];
        }
        return interweaved;
    }

}
