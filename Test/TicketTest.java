import static org.junit.Assert.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.Test;

/**
 * Created by MAHA on 05/04/2022.
 */
public class TicketTest {
    @Test
    public void testEqual() throws ParseException {

        Ticket op=new Ticket();
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        String result=op.check_Ticket(sdf.parse("9:00"));
        assertEquals("full",result);
        /////

        result=op.check_Ticket(sdf.parse("12:00"));
        assertEquals("saver",result);

        ///////
        result=op.check_Ticket(sdf.parse("17:00"));
        assertEquals("full",result);
        //////
        result=op.check_Ticket(sdf.parse("19:33"));
        assertEquals("saver",result);

    }

    @Test
    public void testBoundry() throws ParseException {
        SimpleDateFormat sdf= new SimpleDateFormat("HH:mm");
        Ticket op =new Ticket();
        //////
        String result= op.check_Ticket(sdf.parse("9:29"));
        assertEquals("full",result);
        ///////

        result= op.check_Ticket(sdf.parse("9:30"));
        assertEquals("saver",result);
        //////

        result= op.check_Ticket(sdf.parse("16:00"));
        assertEquals("saver",result);
        ////
        result= op.check_Ticket(sdf.parse("16:01"));
        assertEquals("full",result);
        ////
        result= op.check_Ticket(sdf.parse("19:30"));
        assertEquals("full",result);
        ///
        result= op.check_Ticket(sdf.parse("19:31"));
        assertEquals("saver",result);

    }

}