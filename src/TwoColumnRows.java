import java.util.Scanner;

public class TwoColumnRows {

    public static void main(String[] args) {
        // Create a 2D array with 3 rows and 2 columns
        String[][] getAndReverse = new String[3][2];

        Scanner scanner = new Scanner(System.in);

        // Get input from the user for the first column
        System.out.println("Enter 3 values for the first column:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter value" + (i + 1) + ": ");
            getAndReverse[i][0] = scanner.nextLine();
        }
        // Reverse the values from the first column and store them in the second column
        for (int i = 0; i < 3; i++) {
            getAndReverse[i][1] = getAndReverse[2 - i][0];
        }

        // Display the resulting array
        System.out.println("\nThe resulting multidimensional array:");
        for (int i = 0; i < 3; i++) {
            System.out.println(getAndReverse[i][0] + " " + getAndReverse[i][1]);
        }
    }
}

