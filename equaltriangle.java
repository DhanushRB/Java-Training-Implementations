import java.util.*;
public class equaltriangle {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        int i,j, k;
        for (i = 1; i <= n; i++) {
            for (j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
