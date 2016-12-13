import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static org.testng.Assert.assertEquals;

/**
 * Created by $ fenghua on 2016/12/13.
 */
public class HarryPotterTest {

    private HarryPotter hp;

    @BeforeClass
    public void setUp() throws Exception{
        hp = new HarryPotter();
    }

    @Test
    public void priceForOne(){
        assertEquals("8 EUR", hp.printPrice(1));
    }
    @Test
    public void priceForTwoDiff(){
        assertEquals(2*8*0.95+"EUR",hp.printPrice(2));
    }
    @Test
    public void priceForThreeDiff(){
        assertEquals(3*8*0.9+"EUR",hp.printPrice(3));
    }
    @Test
    public void priceForFourDiff(){
        assertEquals(4*8*0.8+"EUR",hp.printPrice(4));
    }
    @Test
    public void priceForFiveDiff(){
        assertEquals(5*8*0.75+"EUR",hp.printPrice(5));
    }
    //@Test
    //public void priceThreeDiffOfFour(){
        //assertEquals("",hp.printPrice(5));
    //}
}
