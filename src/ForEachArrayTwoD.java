public class ForEachArrayTwoD {

    public static void main(String[] args) {

        String[][] fruits = {{"Apple", "Orange"}, {"Banana", "Grape", "Pineapple"}};

        for (String[] row : fruits) {
            System.out.println();

            for (String fruit : row) {
                System.out.println(fruit + " ");
            }
        }
    }
}
