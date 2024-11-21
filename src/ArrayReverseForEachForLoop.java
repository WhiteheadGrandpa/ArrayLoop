public class ArrayReverseForEachForLoop {

    public static void main(String[] args) {

        String[] fruits = {"Apple", "Mango", "Pineapple", "Grape", "Banana"};

        // Print the original array
        System.out.println("Original array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Reverse the array
        int length = fruits.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap elements
            String temp = fruits[i];
            fruits[i] = fruits[length - 1 - i];
            fruits[length - 1 - i] = temp;
        }

        // Print the reversed array
        System.out.println("\nReversed array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}