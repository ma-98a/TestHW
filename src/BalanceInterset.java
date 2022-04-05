/**
 * Created by MAHA on 04/04/2022.
 */
public class BalanceInterset {

    public String interest(int balan)
    {
        if (balan<0)
            return "invalid";
        else if (balan<=100)
            return "3%";
        else if (balan<=1000)
            return "5%";
        else
            return "7%";
    }
}
