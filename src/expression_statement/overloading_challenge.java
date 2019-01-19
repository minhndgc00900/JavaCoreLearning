package expression_statement;

public class overloading_challenge
{
    public static void main(String[] args) {
        String pr = getDurationString(114, 59);
        System.out.println(pr);
        String pr2 = getDurationString(3600);
        System.out.println(pr2);
    }

    public static String getDurationString(int minutes, int seconds)
    {
        if (minutes >= 0 && (seconds >=0 && seconds <= 59))
        {
            int hours = minutes / 60;
            int remainderMin = minutes % 60;
            return hours + "h " + remainderMin + "m " + seconds + "s ";
        }
        return "invalid";
    }

    public static String getDurationString(int seconds)
    {
        if (seconds >= 0)
        {
            int newMin = seconds / 60;
            int remainderSec = seconds % 60;
            return getDurationString(newMin, remainderSec);
        }
        return "invalid";
    }
}

//1h 60
//x   80