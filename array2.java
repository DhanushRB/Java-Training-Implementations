import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n = in.nextInt();

        int a[] = new int[n];

        System.out.print("Enter the values for array");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();

        }

        System.out.println("Enter the value for find in array");
        int b = in.nextInt();

        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                System.out.println("True");
                break;
            } else {
                System.out.println("False");

            }

        }
    }
}




