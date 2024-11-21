public class ArrayDoWhileLoop {

    public static void main(String[] args) {

        String[] vegetables = {"Apple", "Mango", "Pineapple", "Grape", "Banana" };

        int i = 0;

        do {
            System.out.println(vegetables[i]);
            i++;
        } while (i < vegetables.length);
    }
}
