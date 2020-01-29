import sun.reflect.generics.tree.ArrayTypeSignature;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {


        int[] array1 = {12, 23, 45, 36, 67};
        String[] array2 = {"ramesh", "mahesh", "suresh", "raj"};

        System.out.println("Original array is:" + Arrays.toString(array1));
        System.out.println("sorted array is: %s" + Arrays.toString(array1));
        System.out.println("Original array is:" + Arrays.toString(array2));
        System.out.println("sorted array is :" + Arrays.toString(array2));
    }

}


