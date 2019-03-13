package control_flow_statement;

public class while_and_do_while
{
    public static void main(String[] args)
    {

        //this is the while loop
        int count = 1;
        while (count < 6)
        {
            System.out.println("result is " + count);
            count++;
        }

        //which is identical with this for loop
        for (count = 1; count < 6; count++)
        {
            System.out.println("result2 is " + count);
        }


        //another fashion to execute while loop above
        //Trong đó $condition là điều kiện để dừng vòng lặp. =>
        // Nếu $condition có giá trị false thì vòng lặp kết thúc, ngược lại vòng lặp sẽ tiếp tục lặp. =>
        // Vòng lặp while sẽ lặp vô hạn nếu biểu thức điều kiện bạn truyền vào luôn luôn đúng. =>
        count =1;
        while (true)
        {
            if (count > 5)
            {
                break;
            }
            System.out.println("result3 is " + count);
            count++;
        }

        //do-while
        count = 1;
        do {
            System.out.println("result4 is " + count);
            count++;
        }while (count < 6);



        //challenge 1
        int i = 4;
        int Count = 0;
        while (i < 20)
        {

            i++;

            if (!isEvenNumber(i))
            {
                continue; //to skip the values are not match with the condition
            }
            else
            {
                System.out.println(i + " is even number");
                Count++;
                if (Count == 5)
                {
                    break;
                }
            }
        }
        System.out.println("total is " + Count);



//        //challenge
//        i = 4;
//        while (i < 20)
//        {
//            i++;
//            if (!isEvenNumber(i))
//            {
//                continue;
//            }
//            else
//            {
//                System.out.println(i + " is even number");
//            }
//        }


    }

    //serve for challenge 1 and 2
    public static boolean isEvenNumber(int n)
    {
        if (n % 2 == 0)
        {
            return true;
        }
        return false;
    }
}
