package expression_statement;

public class code_block_if_else_and_method
{
    public static void main(String[] args)
    {
        //if statement identifies which
        //statement or code block to run based on the value of
        //an expression. In other words based on a specific condition.

        //inside the code block defined by curly braces
        //{ and } we can have one or multiple statements

        //we can use "else" statenebt after "if". In that case
        //when the condition is false, the else block will be executed.

        //we can also use "else if" to test multiple condition

//        boolean gameOver = true;
//        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//
//        if(gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore);
//        }


        //to use method calculateScore(), we need to do like this, the things in
        //the bracket is value of parameter created in their method.
        //make sure that the value must be match with datatype of each parameter
        int highScore = calculateScore(true, 800, levelCompleted, bonus);
        System.out.println("your final score was " + highScore);


        highScore = calculateScore(true, 200, 3, 50);
        System.out.println("your final score was " + highScore);

        int data = calculateHighScorePosition(1000);
        displayHighScorePosition("Minh", data);
        int data2 = calculateHighScorePosition(900);
        displayHighScorePosition("Tran", data2);
        int data3 = calculateHighScorePosition(400);
        displayHighScorePosition("Tuan", data3);
        int data4 = calculateHighScorePosition(50);
        displayHighScorePosition("Hang", data4);

        //challenge
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score " + finalScore);
//        }
    }

    //create new method so that we can use it again and again
    //there are 4 parameters defined, we dont need to create new variable for those parameter in this method.
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
    //voids means  dont send any value back. so you are creating a method and you dont want
        //to return any information. Void means nothing , empty or dont return anything
        //Any method that is not declared void must contain a return statement
        //here we change void into int, that means we want to return something with datatype is "int"
        if(gameOver)
        {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
            // return is used to exit from a method, with or without a value.
        }

        //it is not ok to just if ganeOver is set to true to return a value.
        //we still need to send the value back even if the gameOver isn't true
        return -1;
        //return -1 indicates the value is invalid or not found.
    }


    //challenge
    public static void displayHighScorePosition(String name, int position)
    {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int theScore)
    {
        if (theScore >= 1000)
        {
            int position = 1;
            return position;
        }
        else if (theScore >= 500)
        {
            int position = 2;
            return position;
        }
        else if (theScore >= 100)
        {
            int position = 3;
            return position;
        }
        else
        {
            int position = 4;
            return position;
        }
    }
}



