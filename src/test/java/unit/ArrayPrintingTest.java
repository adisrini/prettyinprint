package test.java.unit;

import org.junit.Test;import main.java.prettyinprint.Decoration;
import main.java.prettyinprint.Orientation;

import org.junit.Assert;
import test.java.util.TestData;

public class ArrayPrintingTest extends BasePrintingTest {
    
    @Test
    public void testPrintingEmptyIntegerArray() {
        Integer[] integerArray = new Integer[TestData.getCount()];
        Assert.assertEquals("Empty.", client.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerArray() {
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("           0           1           2           3           4           5           6           7           8           9"
                        + "\n           0          11          22          33          44          55          66          77          88          99\n", client.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerFancyArray() {
        client.setDecoration(Decoration.FANCY);
        int length = 10;
        Integer[] integerArray = new Integer[length];
        for(int i = 0; i < length; i++) {
            integerArray[i] = i*11;
        }
        Assert.assertEquals("************************************************************************************************************************************************\n"
                          + "**           0 |           1 |           2 |           3 |           4 |           5 |           6 |           7 |           8 |           9 |**\n"
                          + "**--------------------------------------------------------------------------------------------------------------------------------------------**\n"
                          + "**           0 |          11 |          22 |          33 |          44 |          55 |          66 |          77 |          88 |          99 |**\n"
                          + "************************************************************************************************************************************************\n", client.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerVerticalArray() {
        client.setOrientation(Orientation.VERTICAL);
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
                          + "           9          99\n", client.print(integerArray));
    }
    
    @Test
    public void testPrintingIntegerFancyVerticalArray() {
        client.setDecoration(Decoration.FANCY);
        client.setOrientation(Orientation.VERTICAL);
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
                          + "********************************\n", client.print(integerArray));
    }

}
