/**
 * LinearSearch
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int machValue = 0;

        if (linearSearch(values, machValue)) {
            System.out.println("Value is mach");
        } else {
            System.out.println("Value is don't mach");
        }

    }

    private static boolean linearSearch(int[] values, int machValue) {

        for (int value : values) {

            if (machValue == value) {

                return true; //value is mach
            }
        }

        return false; // mean don't have mach value
    }
}