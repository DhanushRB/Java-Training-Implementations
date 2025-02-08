import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a[] = {4, 2, 7, 4, 9, 3};

        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];

            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Maximum value " + max);
        System.out.println("minimum value " + min);


    }
}




