import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number n:");
        int n = in.nextInt();
        int first = 0;
        int second = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
