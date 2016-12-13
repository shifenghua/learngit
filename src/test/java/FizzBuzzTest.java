import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by Administrator on 2016/12/13.
 */
public class FizzBuzzTest {

    private FizzBuzz fb;
    @BeforeClass
    public void setUp() throws Exception{
         fb = new FizzBuzz();
    }

    @Test
    public void canEvaluate(){
        fb.evaluate(1);
    }

    @Test
    public void oneReturnsOne(){
        assertEquals("1",fb.evaluate(1));
    }
    @Test
    public void twoReturnsTwo(){
        assertEquals("2",fb.evaluate(2));
    }
    @Test
    public void threeReturnsFizz(){
        assertEquals("Fizz",fb.evaluate(3));
    }
}
