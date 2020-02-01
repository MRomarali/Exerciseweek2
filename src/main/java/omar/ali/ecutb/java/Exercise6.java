package omar.ali.ecutb.java;

public class Exercise6 {
    public static void main(String[] args) {
        double[] array = {43.0,5.0,23.0,17.0,2.0,14.0};
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println(array[i]);
        }
        double average = sum / array.length;
        System.out.println("Average value of the array elements is : " + average);

    }
}
