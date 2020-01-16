package org.example;

public class Exercise1
{
    public static void main( String[] args )
    {
        int[] elements = new int[10];
        for (int i = 0; i < 10; i++) {
            elements[i] = i * 10;
            System.out.println("Element " + i + " value is " + elements[i]);
        }
    }
}
