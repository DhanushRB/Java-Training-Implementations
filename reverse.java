import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int n = in.nextInt();
        int r= 0;
        while (n!= 0) {
            int a = n % 10;
            r = r * 10 + a;
            n= n / 10;
        }

        System.out.println("Reversed number is: " + r);
    }
}
