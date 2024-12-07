import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int num = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= num; i++) {
            System.out.print("Enter marks obtained in  each subject " + i + ": ");
            int marks = scanner.nextInt();
            total += marks;
        }

        double Percentage = (double) total / (num * 100) * 100;

        char grade;
        if (Percentage >= 90) {
            grade = 'A';
        } else if (Percentage >= 80) {
            grade = 'B';
        } else if (Percentage >= 70) {
            grade = 'C';
        } else if (Percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("----------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + Percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}