package expression_statement;

public class statementsWhiteSpaceAndIndenting {
    public static void main(String[] args) {
        //statement is the entire line that read int myVar = 50;
        int myVar = 50; //statement
        myVar++; //statement
        myVar--; //statement
        System.out.println("This is a test"); //statement

        System.out.println("this is " +
                "a" +
                "test"); //the 13-15 line is statement

        //this case is still ok but you may get confusing.
        int anotherVar = 50;
        myVar--;

        //INDENTATION (Thụt dòng) IS INDENTING THE CODE
        //SO THAT ITS MORE READABLE LIKE ALL THINGS ABOVE

        //IN INTELLIJ WE CAN CHOOSE "CODE" AND CHOOSE
        //REFORMAT CODE
    }
}
