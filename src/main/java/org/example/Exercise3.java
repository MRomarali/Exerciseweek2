package org.example;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        String[] array = {"Oslo", "Stockholm", "Berlin", "Roma", "London", "New York", "Paris", "Real Madrid"};
        System.out.println(Arrays.toString(array));
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j])>0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        /*String[] array = {"Oslo", "Stockholm", "Berlin", "Roma", "London", "New York", "Paris", "Real Madrid"};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/

    }
}
