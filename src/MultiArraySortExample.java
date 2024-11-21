public class MultiArraySortExample {

    public static void main(String[] args) {
        int[][] multiArr = {{1, 4, 2, 6, 8}, {7, 3, 5, 9, 0}};

        // Sorting each row of the multidimensional array
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length - 1; j++) {
                for (int k = 0; k < multiArr[i].length - j - 1; k++) {
                    if (multiArr[i][k] > multiArr[i][k + 1]) {
                        // Swap multiArr[i][k] and multiArr[i][k + 1]
                        int temp = multiArr[i][k];
                        multiArr[i][k] = multiArr[i][k + 1];
                        multiArr[i][k + 1] = temp;
                    }
                }
            }
        }

        // Print sorted multidimensional array
        System.out.println("Sorted multiArr:");
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}