public class ArrayChangeElement {

    public static void main(String[] args) {

        String[] cars = {"Toyota", "BMW", "Mazda", "Honda" };

        System.out.println("Original Array");
        for (String car : cars) {
            System.out.println(car);
        }

        int length = cars.length;
        for (int i = 0; i < length / 2; i++) {

            String Able = cars[i];
            cars[i] = cars[length - 1 - i];
            cars[length - 1 - i] = Able;

            System.out.println("/n Reversed Array");
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}