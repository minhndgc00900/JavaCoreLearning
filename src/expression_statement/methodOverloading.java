package expression_statement;

public class methodOverloading
{
    public static void main(String[] args) {
        int newScore = calculatorScore("minh", 40);
        System.out.println("return value is " + newScore);

        System.out.println("return value is " + calculatorScore(40));

        calculatorScore();

        double first = calcFeetAndInchesToCentimetres(6, 0);
        if(first < 0)
        {
            System.out.println("Invalid");
        }
        else {
            System.out.println(first);
        }
        double second = calcFeetAndInchesToCentimetres(100);
        System.out.println(second);
    }

    //=====================================================================================//

    public static int calculatorScore(String name, int score)
    {
        System.out.println("Player " + name + " scores " + score + " point(s) ");
        return score * 1000;
    }

    public static int calculatorScore(int score)
    {
        System.out.println("A player scores " + score + " point(s) ");
        return score * 1000;
    }

    public static int calculatorScore()
    {
        System.out.println("no one score a single point");
        return 0;
    }

    public static double calcFeetAndInchesToCentimetres(double feet, double inch)
    {
        if (feet > 0 || ((inch < 0) || (inch > 12)))
        {
            double cal = (feet * 30.48) + (inch * 2.54);
            return cal;
        }

        return -1;
    }

    public static double calcFeetAndInchesToCentimetres(double inch)
    {
        if (inch >= 0)
        {
            double calFeet = (int) inch / 12;
            double remainingInches = (int) inch % 12;
            System.out.println("inch: " + inch + " , feet: " + calFeet + " , remaining Inch: " + remainingInches);
            return calcFeetAndInchesToCentimetres(calFeet, remainingInches);
        }

        return -1;
    }
}

//Nạp chồng phương thức được sử dụng để giúp code của chương trình dễ đọc hơn.
//Nạp chồng phương thức thì tham số phải khác nhau.
//Trong java, nạp chồng phương thức không thể được thực hiện khi chỉ thay đổi
// kiểu giá trị trả về của phương thức. Kiểu giá trị trả về có thể giống hoặc khác.
// Giá trị trả về có thể giống hoặc khác, nhưng tham số phải khác nhau.

