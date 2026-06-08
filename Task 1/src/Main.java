import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        while (true)
        {
            NumberGuessGame game = new NumberGuessGame(10);
            System.out.println("\nGuess a number between 1 and 100");
            boolean won = false;
            while (game.hasAttemptsLeft())
            {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                String result = game.checkGuess(guess);
                if (result.equals("CORRECT"))
                {
                    System.out.println("Correct Guess!");
                    totalScore += game.calculateScore();
                    won = true;
                    break;
                }
                else if (result.equals("LOW"))
                {
                    System.out.println("Too Low!");
                }
                else
                {
                    System.out.println("Too High!");
                }
            }
            if (!won)
            {
                System.out.println("You Lost!");
                System.out.println("Number was: " + game.getRandomNumber());
            }
            System.out.println("Total Score: " + totalScore);
            System.out.print("Play Again? (yes/no): ");
            String choice = sc.next();
            if (!choice.equalsIgnoreCase("yes"))
            {
                break;
            }
        }
        System.out.println("Thanks for Playing!");
        sc.close();
    }
}