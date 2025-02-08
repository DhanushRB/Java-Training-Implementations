import java.util.*;
public class compoundinterest {
    void main(float p, float r, int t, int n) {

        var ci = p * Math.pow((1 + r / (100 * n)), (t * n));
        System.out.println("compound interest of " + p + " is:" + ci);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principal amount:");
        float p = in.nextFloat();
        System.out.print("Enter the Rate:");
        float r = in.nextFloat();
        System.out.print("Enter the Time:");
        int t = in.nextInt();
        System.out.print("Enter the number:");
        int n = in.nextInt();
        compoundinterest S = new compoundinterest();
        S.main(p, r, t, n);
    }
}