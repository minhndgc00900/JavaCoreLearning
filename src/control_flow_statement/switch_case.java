package control_flow_statement;

public class switch_case
{
    public static void main(String[] args)
    {
        int switchValue = 3;

        switch (switchValue)
        {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("not any either");
                break;
        }


        ////challenge
        char swValue = 'C';
        switch (swValue)
        {
            case 'A':
                System.out.println("dddd");
                break;
            case 'B':
                System.out.println("xxxx");
                break;
            case 'C': case 'D' :
                System.out.println("xw");
                break;
            default:
                System.out.println("stop");
                break;
        }
    }
}

