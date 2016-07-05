package test.java.unit;

import org.junit.Test;

import org.junit.Assert;
import main.java.prettyinprint.Decoration;
import main.java.prettyinprint.Orientation;
import main.java.prettyinprint.PIP;
import test.java.util.TestData;

public class DecorationOrientationSettersTest {
    
    @Test
    public void testSetDecorationSameAsPrintDecoration() {
        Decoration dec = Decoration.FANCY;
        PIP.setDecoration(dec);
        int length = TestData.getCount();
        Integer[] array = new Integer[length];
        for(int i = 0; i < length; i++) {
            array[i] = TestData.getInteger();
        }
        Assert.assertTrue(PIP.print(array).equals(PIP.print(array, dec)));
    }
    
    @Test
    public void testSetOrientationSameAsPrintOrientation() {
        Orientation ori = Orientation.VERTICAL;
        PIP.setOrientation(ori);
        int length = TestData.getCount();
        Integer[] array = new Integer[length];
        for(int i = 0; i < length; i++) {
            array[i] = TestData.getInteger();
        }
        Assert.assertTrue(PIP.print(array).equals(PIP.print(array, ori)));
    }
    
    @Test
    public void testSetOrientationAndDecorationSameAsPrintOrientationAndDecoration() {
        Decoration dec = Decoration.FANCY;
        Orientation ori = Orientation.VERTICAL;
        PIP.setDecoration(dec);
        PIP.setOrientation(ori);
        int length = TestData.getCount();
        Integer[] array = new Integer[length];
        for(int i = 0; i < length; i++) {
            array[i] = TestData.getInteger();
        }
        Assert.assertTrue(PIP.print(array).equals(PIP.print(array, dec, ori)));
    }

}
