import java.util.*;
public class leftarrow{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        int i,j,k;
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
            }
            for (i = n-2; i >= 0; i--) {
                for (j = n - i; j > 1; j--) {
                    System.out.print(" ");
                }
                for (k = 0; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    }

