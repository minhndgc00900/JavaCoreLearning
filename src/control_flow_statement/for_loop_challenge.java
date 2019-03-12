package control_flow_statement;

public class for_loop_challenge
{
    public static void main(String[] args)
    {
        int count = 0;
        //'count' can be printed out, but in this case, count will help stop the for loop =>
        //when we create condition for count, for example in this case, we create "if(count=5)=>
        //the count will be increment every single time and it will stick with every single value in =>
        // the array of for loop
        int sum = 0;

        for (int i = 1; i <= 1000; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                count++;
                sum = sum + i;

                System.out.println("array is " + i);
//                System.out.println("count is " + count);

            }

            if (count == 5)
            {
                break;
            }
        }

        System.out.println("total is " + sum);


    }

//    public static int isDivided(int n)
//    {
//
//    }
}



