import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by MAHA on 04/04/2022.
 */
public class BalanceIntersetTest {
    @Test
    public  void testNumberLess0()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(-1);
        assertEquals("invalid",result);

    }

    @Test
    public  void testNumber0()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(0);
        assertEquals("3%",result);
    }

    @Test
    public  void testNumber20()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(20);
        assertEquals("3%",result);
    }

    @Test
    public  void testNumber100()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(100);
        assertEquals("3%",result);
    }

    @Test
    public  void testNumber101()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(101);
        assertEquals("5%",result);
    }

    @Test
    public  void testNumber300()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(300);
        assertEquals("5%",result);
    }

    @Test
    public  void testNumber1000()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(1000);
        assertEquals("5%",result);
    }

    @Test
    public  void testNumber1001()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(1001);
        assertEquals("7%",result);
    }

    @Test
    public  void testNumber2000()
    {
        BalanceInterset b=new BalanceInterset();
        String result =b.interest(2000);
        assertEquals("7%",result);
    }


}