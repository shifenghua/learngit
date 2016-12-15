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
        int[] num = {0,0,0,0,1};
        assertEquals(8.00, hp.printPrice(num));
    }
    @Test
     public void priceForTwoDiff(){
        int[] num = {0,0,0,1,1};
        assertEquals(2*8*0.95,hp.printPrice(num));
    }
     @Test
    public void priceForThreeDiff(){

         int[] num = {0,0,1,1,1};
         assertEquals(3*8*0.9,hp.printPrice(num));
    }
    @Test
    public void priceForFourDiff(){

        int[] num = {0,1,1,1,1};
        assertEquals(4*8*0.8,hp.printPrice(num));
    }
    @Test
    public void priceForFiveDiff(){
        int[] num = {1,1,1,1,1};
        assertEquals(5*8*0.75,hp.printPrice(num));
    }
    @Test
    public void priceThreeDiffOfFour(){
        int[] num={1,1,2,2,2};
        assertEquals(51.6,hp.printPrice(num));
    }
}
