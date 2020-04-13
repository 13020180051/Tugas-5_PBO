import java.util.Arrays;

/**
 *
 * @author arby
 */
public class UrutArray {

    public static void main(String[] args) {

        int[] intArray = {1, 3, 81, 2, 22, 47};
        System.out.println("\n****** Unsorted Integer Array *******");
        for(int x: intArray){
            System.out.print(x+" ");
        }
        Arrays.sort(intArray);

        System.out.println("\n****** Sorted Integer Array *******");
        for(int x: intArray){
            System.out.print(x+" ");
        }
    }
}