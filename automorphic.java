import java.util.*;
public class automorphic{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int square = n * n;

        if (String.valueOf(square).endsWith(String.valueOf(n))) {
            System.out.println(square + " is an Automorphic number.");
        } else {
            System.out.println(square + " is not an Automorphic number.");
        }

        in.close();
    }
}
