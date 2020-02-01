package omar.ali.ecutb.java;

public class Exercise2 {
    public static int indexOF(int array[], int tal ){
        if (array == null) {
            return -1;
        }

        int len = array.length;
        int i = 0;
        while (i < len){
            if (array[i] == tal) {
                return i;
            }else {
                i += 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] my_Array = {3,5,7,4,2,6,0,9,6,4};

        System.out.println("Index position of 6 = " + indexOF(my_Array, 6));
        System.out.println("Index position of 9 = " + indexOF(my_Array, 9));
    }
}
