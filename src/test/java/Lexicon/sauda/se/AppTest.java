package Lexicon.sauda.se;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void Testaddition()
    {
        double Number1 =30;
        double Number2 =10;
        double expected = 40;
        double delta =0;

        Assert.assertEquals(expected,App.addition(Number1,Number2),delta);
    }
    @Test
    public void Testsubtraction()
    {
        double Number1 =20;
        double Number2 =10;
        double expected = 10;
        double delta =0;

        Assert.assertEquals(expected,App.subtraction(Number1,Number2),delta);
    }
    @Test
    public void Testmultiplikation()
    {
        double Number1 =10;
        double Number2 =10;
        double expected = 100;
        double delta =0;

        Assert.assertEquals(expected,App.multiplication(Number1,Number2),delta);
    }
    @Test
    public void Testdivision()
    {
        double Number1 =60;
        double Number2 =10;
        double expected = 6;
        double delta =0;

        Assert.assertEquals(expected,App.Division(Number1,Number2),delta);
    }

}
