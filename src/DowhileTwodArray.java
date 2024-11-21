public class DowhileTwodArray {

    public static void main(String[] args) {

        String[][] vegetables = {{"Apple", "Mango"}, {"Pineapple", "Grape", "Banana"}};

        int i = 0;

        do {
            int j = 0;

            do {
                System.out.println(vegetables[i][j]);
                j++;

            } while (j < vegetables[i].length);
            i++;
        } while (i < vegetables.length);

    }
}






