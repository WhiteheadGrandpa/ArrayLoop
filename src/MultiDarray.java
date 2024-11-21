public class MultiDarray {

    public static void main(String[] args) {

        int[][] values = {{4, 5, 6}, {7, 8, 9}};

        int i = 0;
        int y = 0;

        // Outer while loop to iterate over rows
        while (y < values.length) {
            System.out.println();

            // Inner while loop to iterate over columns in the current row
            while (i < values[y].length) {
                System.out.println(values[y][i] + " ");
                i++;
            }

            // Reset the column index and move to the next row
            i = 0;
            y++;
        }
    }
}