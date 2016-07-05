package test.java.unit;

import org.junit.Test;
import main.java.prettyinprint.Decoration;
import main.java.prettyinprint.Orientation;
import main.java.prettyinprint.PIP;

import org.junit.Assert;

import test.java.util.TestData;

public class ArrayPrintingTest {
    
    @Test
    public void testPrintingEmptyIntegerArray() {
        Integer[] integerArray = new Integer[TestData.getCount()];
        Assert.assertEquals("", PIP.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerArray() {
        PIP.setOrientation(Orientation.HORIZONTAL);
        PIP.setDecoration(Decoration.NORMAL);
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("           0           1           2           3           4           5           6           7           8           9"
                        + "\n           0          11          22          33          44          55          66          77          88          99\n", PIP.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerFancyArray() {
        PIP.setOrientation(Orientation.HORIZONTAL);
        PIP.setDecoration(Decoration.FANCY);
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("************************************************************************************************************************************************\n"
                          + "**           0 |           1 |           2 |           3 |           4 |           5 |           6 |           7 |           8 |           9 |**\n"
                          + "**--------------------------------------------------------------------------------------------------------------------------------------------**\n"
                          + "**           0 |          11 |          22 |          33 |          44 |          55 |          66 |          77 |          88 |          99 |**\n"
                          + "************************************************************************************************************************************************\n", PIP.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerVerticalArray() {
        PIP.setDecoration(Decoration.NORMAL);
        PIP.setOrientation(Orientation.VERTICAL);
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("           0           0\n"
                          + "           1          11\n"
                          + "           2          22\n"
                          + "           3          33\n"
                          + "           4          44\n"
                          + "           5          55\n"
                          + "           6          66\n"
                          + "           7          77\n"
                          + "           8          88\n"
                          + "           9          99\n", PIP.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerFancyVerticalArray() {
        PIP.setDecoration(Decoration.FANCY);
        PIP.setOrientation(Orientation.VERTICAL);
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("********************************\n"
                          + "**           0 |           0 |**\n"
                          + "**           1 |          11 |**\n"
                          + "**           2 |          22 |**\n"
                          + "**           3 |          33 |**\n"
                          + "**           4 |          44 |**\n"
                          + "**           5 |          55 |**\n"
                          + "**           6 |          66 |**\n"
                          + "**           7 |          77 |**\n"
                          + "**           8 |          88 |**\n"
                          + "**           9 |          99 |**\n"
                          + "********************************\n", PIP.print(integerArray));
    }

}
