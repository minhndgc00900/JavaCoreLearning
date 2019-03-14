package control_flow_statement;

public class parsing_values_from_a_string
{
    public static void main(String[] args) {
        String stringNumber = "2018";

        int intNumber = Integer.parseInt(stringNumber);
        System.out.println("int Number is: " + intNumber);

        stringNumber +=1;
        intNumber += 1;

        System.out.println(stringNumber);
        System.out.println(intNumber);
    }
}
