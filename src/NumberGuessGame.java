import java.util.Random;
public class NumberGuessGame
{
    private int randomNumber;
    private int maxAttempts;
    private int attemptsTaken;
    public NumberGuessGame(int maxAttempts)
    {
        this.maxAttempts = maxAttempts;
        this.attemptsTaken = 0;
        generateNumber();
    }
    private void generateNumber()
    {
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;
    }
    public String checkGuess(int guess)
    {
        attemptsTaken++;
        if (guess == randomNumber)
        {
            return "CORRECT";
        }
        else if (guess < randomNumber)
        {
            return "LOW";
        }
        else
        {
            return "HIGH";
        }
    }
    public boolean hasAttemptsLeft()
    {
        return attemptsTaken < maxAttempts;
    }
    public int getAttemptsTaken()
    {
        return attemptsTaken;
    }
    public int getMaxAttempts()
    {
        return maxAttempts;
    }
    public int getRandomNumber()
    {
        return randomNumber;
    }
    public int calculateScore()
    {
        return maxAttempts - attemptsTaken + 1;
    }
}
