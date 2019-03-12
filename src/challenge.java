public class challenge
{

    private  static final String PARA_PRA = "invalid";
    public static void main(String[] args)
    {
        String b = getDurationString(100000);
        System.out.println(b);
//        String a = getDurationString(80, 59);
//        System.out.println(a);
    }

    public static String getDurationString(int min, int sec)
    {
        if (min < 0)
        {
            return PARA_PRA;
        }
        else
        {
            if (sec < 0 && sec > 59)
            {
                return PARA_PRA;
            }
            else
            {
                int h = min/60;
                int m = min % 60;
//                System.out.println(h + "h " + m + " m "  + sec + "s ");
                return h + " hour(s) " + m + " min(s) " + sec + " s ";

            }
        }
    }

    public static String getDurationString(int sec)
    {
        if(sec < 0)
        {
            return PARA_PRA;
        }
        else {
            int newMin = sec/60;
            int newSec = sec % 60;
            return getDurationString(newMin, newSec);
        }
    }


}
