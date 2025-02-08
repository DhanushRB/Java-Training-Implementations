import java.util.*;

public class soliddiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = in.nextInt();
        int i,j,k;
        for ( i = 1; i <= n; i++) {
            for ( j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for ( k= 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for ( j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

