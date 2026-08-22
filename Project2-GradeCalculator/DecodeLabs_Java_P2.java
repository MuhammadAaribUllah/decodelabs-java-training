import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== DecodeLabs Student Grade Calculator ===");

        int numSubjects = 0;
        boolean validCount = false;

        // Get number of subjects (validated)
        while (!validCount) {
            System.out.print("Enter number of subjects: ");
            try {
                numSubjects = sc.nextInt();
                if (numSubjects <= 0) {
                    System.out.println("Number of subjects must be greater than 0.");
                } else {
                    validCount = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid whole number.");
                sc.next();
            }
        }

        int totalMarks = 0;

        // Accumulator loop with validation (0-100 range)
        for (int i = 1; i <= numSubjects; i++) {
            boolean validMark = false;
            while (!validMark) {
                System.out.print("Enter marks for subject " + i + " (out of 100): ");
                try {
                    int mark = sc.nextInt();
                    if (mark < 0 || mark > 100) {
                        System.out.println("Marks must be between 0 and 100. Try again.");
                    } else {
                        totalMarks += mark;
                        validMark = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid whole number.");
                    sc.next();
                }
            }
        }

        // Cast to double BEFORE dividing to avoid truncation
        double percentage = (double) totalMarks / numSubjects;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n=== Result ===");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
