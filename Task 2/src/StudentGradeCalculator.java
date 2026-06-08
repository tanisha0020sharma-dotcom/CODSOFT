public class StudentGradeCalculator
{
    private int totalMarks;
    private double averagePercentage;
    public void calculateResult(int[] marks)
    {
        totalMarks = 0;
        for (int mark : marks)
        {
            totalMarks += mark;
        }
        averagePercentage = (double) totalMarks / marks.length;
    }
    public int getTotalMarks()
    {
        return totalMarks;
    }
    public double getAveragePercentage()
    {
        return averagePercentage;
    }
    public String getGrade()
    {
        if (averagePercentage >= 90)
            return "A+";
        else if (averagePercentage >= 80)
            return "A";
        else if (averagePercentage >= 70)
            return "B";
        else if (averagePercentage >= 60)
            return "C";
        else if (averagePercentage >= 50)
            return "D";
        else
            return "F";
    }
}