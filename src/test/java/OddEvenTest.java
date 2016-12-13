import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

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
    public void printNum(){
     oe = new OddEven();
    }
    @Test
    public void threePrintThree(){
        assertEquals("3",oe.evaluate(3));
    }
    @Test
    public void  fourPrintFour(){
       assertEquals("4",oe.evaluate(4));
    }
}
