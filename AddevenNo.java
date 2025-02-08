import java.util.*;
public class AddevenNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();

        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }

        System.out.println("The sum of even digits is: " + sum);
    }
}
