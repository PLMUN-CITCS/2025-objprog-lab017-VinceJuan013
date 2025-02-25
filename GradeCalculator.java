import java.util.Scanner;

public class GradeCalculator {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get the student's score
        double score = getStudentScore();
        
        // Calculate and display the grade
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
        
        // Close the scanner
        scanner.close();
    }

    /**
     * Gets the student's score from user input
     * @return the validated score as a double
     */
    private static double getStudentScore() {
        double score = 0;
        boolean validInput = false;
        
        while (!validInput) {
            System.out.print("Enter your score: ");
            try {
                score = Double.parseDouble(scanner.nextLine());
                
                // Validate score range
                if (score >= 0 && score <= 100) {
                    validInput = true;
                } else {
                    System.out.println("Error: Score must be between 0 and 100. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number.");
            }
        }
        
        return score;
    }

    /**
     * Calculates the letter grade based on the numerical score
     * @param score the numerical score
     * @return the letter grade as a String
     */
    private static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

