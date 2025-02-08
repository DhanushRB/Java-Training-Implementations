import java.util.*;

class friendlypair {
    public static int factor(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1 = in.nextInt();
        System.out.print("Enter n2: ");
        int n2 = in.nextInt();

        if (factor(n1) == n2 && factor(n2) == n1) {
            System.out.println(n1 + " and " + n2 + " are friendly pairs.");
        } else {
            System.out.println(n1 + " and " + n2 + " are not friendly pairs.");
        }
    }
}

