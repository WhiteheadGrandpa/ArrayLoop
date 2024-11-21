import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicatesExample {

    public static void main(String[] args) {
        int[] singleArr = {2, 40, 2, 5, 3, 40, 3};

        // Arrays to store duplicates and non-duplicates
        ArrayList<Integer> duplicates = new ArrayList<>();
        ArrayList<Integer> nonDuplicates = new ArrayList<>();

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicatesSet = new HashSet<>();

        // Identify duplicates and non-duplicates
        for (int num : singleArr) {
            if (seen.contains(num)) {
                if (!duplicatesSet.contains(num)) {
                    duplicates.add(num);   // Add to duplicates if it's not already added
                    duplicatesSet.add(num);
                }
            } else {
                nonDuplicates.add(num);   // Add to non-duplicates if it's seen first time
                seen.add(num);
            }
        }

        // Prepare the multidimensional array
        int[][] multiArr = new int[3][];

        // Row 0: duplicates
        multiArr[0] = duplicates.stream().mapToInt(i -> i).toArray();

        // Row 1: non-duplicates
        multiArr[1] = nonDuplicates.stream().mapToInt(i -> i).toArray();

        // Row 2: reverse of non-duplicates
        int[] reversedNonDuplicates = new int[nonDuplicates.size()];
        for (int i = 0; i < nonDuplicates.size(); i++) {
            reversedNonDuplicates[i] = nonDuplicates.get(nonDuplicates.size() - 1 - i);
        }
        multiArr[2] = reversedNonDuplicates;

        // Print the output
        System.out.println("Single array (input): ");
        for (int num : singleArr) {
            System.out.print(num + " ");
        }
        System.out.println("\n\nMulti-dimensional array (output): ");
        for (int i = 0; i < multiArr.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}