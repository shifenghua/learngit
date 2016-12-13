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
        assertEquals("15.2EUR",hp.printPrice(2));
    }
    @Test
    public void priceForThreeDiff(){
        assertEquals("21.6EUR",hp.printPrice(3));
    }
    @Test
    public void priceForFourDiff(){
        assertEquals("25.6EUR",hp.printPrice(4));
    }
    @Test
    public void priceForFiveDiff(){
        assertEquals("30.0EUR",hp.printPrice(5));
    }
}
