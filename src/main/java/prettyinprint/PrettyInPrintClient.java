package main.java.prettyinprint;

import java.lang.reflect.Constructor;

import main.java.util.Formatter;

public class PrettyInPrintClient implements PrettyInPrint {

    private Decoration decoration;
    private Orientation orientation;

    /**
     * Initializes the printing client with a default {@link Decoration} of
     * {@code Decoration.NORMAL} and {@link Orientation}
     * of {@code Orientation.HORIZONTAL}. This is equivalent to calling
     * {@code PrettyInPrintClient(Decoration.NORMAL, Orientation.HORIZONTAL)}
     */
    public PrettyInPrintClient() {
        this(Decoration.NORMAL, Orientation.HORIZONTAL);
    }

    /**
     * Initializes the printing client with a default {@link Orientation}
     * of {@code Orientation.HORIZONTAL}. This is equivalent to calling
     * {@code PrettyInPrintClient(decoration, Orientation.HORIZONTAL)}
     */
    public PrettyInPrintClient(Decoration decoration) {
        this(decoration, Orientation.HORIZONTAL);
    }

    /**
     * Initializes the printing client with a default {@link Decoration}
     * of {@code Decoration.NORMAL}. This is equivalent to calling
     * {@code PrettyInPrintClient(Decoration.NORMAL, orientation)}
     */
    public PrettyInPrintClient(Orientation orientation) {
        this(Decoration.NORMAL, orientation);
    }

    /**
     * Initializes the printing client with the specified decoration and
     * orientation types.
     */
    public PrettyInPrintClient(Decoration decoration, Orientation orientation) {
        this.decoration = decoration;
        this.orientation = orientation;
    }

    @Override
    public String print(Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        Class<?> clazz;
        try {
            clazz = Class.forName("main.java.objects." + Formatter.className(simpleName) + decoration.suffix() + orientation.suffix());
            Constructor<?> constructor = clazz.getDeclaredConstructor(Object.class);
            PrintableObject po = (PrintableObject) constructor.newInstance(obj);
            String output = po.output();
            System.out.println(output);
            return output;
        } catch(Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
    
    @Override
    public String print(Object obj, Decoration d) {
        decoration = d;
        return print(obj);
    }

    @Override
    public String print(Object obj, Orientation o) {
        orientation = o;
        return print(obj);
    }

    @Override
    public String print(Object obj, Decoration d, Orientation o) {
        decoration = d;
        orientation = o;
        return print(obj);
    }

    @Override
    public void setDecoration(Decoration d) {
        decoration = d;
    }
    
    @Override
    public void setOrientation(Orientation o) {
        orientation = o;
    }

}
