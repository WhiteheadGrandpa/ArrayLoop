import java.util.Arrays;

class MultiArraySort {


    public static void main(String[] args) {

        int singlearray [] = {2, 40, 2, 5, 3, 40, 3};
        int temp_array[] = new int [3];
        int multiarray[][] = new int[3][];


        int o = 0;
        for (int i = 0; i < singlearray.length; i++) {
            for (int j = 0; i < singlearray.length; j++) {

                if (i == j) {
                    continue;
                }
                if (singlearray[i] == singlearray[j]) {
                    temp_array [o] = singlearray[i];
                    multiarray[0][o] = singlearray[i];
                    o++;
                    break;
                }
                System.out.println(Arrays.toString(multiarray));
            }
        }
    }
}
