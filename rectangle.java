import java.util.*;
public class rectangle
{
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number n:");
        int n = in.nextInt();
        System.out.println("enter the number m:");
        int m = in.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
