import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0;

        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double average = sum / (double) n;
        System.out.println("Average Marks: " + average);

        if (average >= 90) System.out.println("Grade: A");
        else if (average >= 75) System.out.println("Grade: B");
        else if (average >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: F");
    }
}
