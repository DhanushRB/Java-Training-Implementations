import java.util.*;
public class multiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number n:");
        int n = in.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i+ "*" +n+"="+i*n);
        }
    }
}