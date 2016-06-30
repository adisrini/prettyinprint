package test.java.unit;

import org.junit.After;
import org.junit.Before;

import main.java.prettyinprint.PrettyInPrint;
import main.java.prettyinprint.PrettyInPrintClient;

public abstract class BasePrintingTest {

    protected PrettyInPrint client;

    @Before
    public void setUp() {
        client = new PrettyInPrintClient();
    }
    
    @After
    public void tearDown() {
        client = null;
    }
    
}
