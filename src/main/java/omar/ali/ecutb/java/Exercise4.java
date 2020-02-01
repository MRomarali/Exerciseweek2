package omar.ali.ecutb.java;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] array = {1, 2,3,4,5,6,7,8,9};
        int[] array2 = array;
        System.out.println("First Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Second Array");
        System.out.println(Arrays.toString(array2));
        int[] array3 = {10,11,12,13,14,15};
        int[] array4 = new int[array3.length];
        array4 = array3;
        System.out.println("Third Array");
        System.out.println(Arrays.toString(array3));
        System.out.println("Forth Array");
        System.out.println(Arrays.toString(array4));
    }
}
