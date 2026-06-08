import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        StudentGradeCalculator calculator = new StudentGradeCalculator();
        calculator.calculateResult(marks);
        System.out.println("\n----- RESULT -----");
        System.out.println("Total Marks: " + calculator.getTotalMarks());
        System.out.printf("Average Percentage: %.2f%%\n",
                calculator.getAveragePercentage());
        System.out.println("Grade: " + calculator.getGrade());
        sc.close();
    }
}