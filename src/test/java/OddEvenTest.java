import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Created by $ fenghua on 2016/12/13.
 */
public class OddEvenTest {
    private OddEven oe;
    @BeforeClass
    public void setUp() throws Exception{
        oe = new OddEven();
    }
    @Test
    public void  printNum(){
        assertTrue(!(oe.printNum() ==null));
    }

    @Test
    public void ninePrintOdd(){
        assertEquals("Odd",oe.evaluate(9));
    }
    @Test
    public void tenPrintEven(){
        assertEquals("Even",oe.evaluate(10));
    }
    @Test
    public void primePrintNum(){
        assertEquals("1",oe.evaluate(1));
    }
}
