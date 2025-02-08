import java.util.*;

public class Rectangle1 {
    int area;
    int perimeter;
    int l, b;

    void area() {
        area = l * b;
        System.out.println("Area: " + area);
    }

    void perimeter() {
        perimeter = 2 * (l + b);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = in.nextInt();
        System.out.println("Enter the breadth:");
        int breadth = in.nextInt();

        Rectangle1 r1 = new Rectangle1();
        r1.l = length;
        r1.b = breadth;

        r1.area();
        r1.perimeter();
    }
}
