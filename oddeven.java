import java.util.*;
public class oddeven {

    void main(int n1) {

        if (n1 % 2 == 0) {
            System.out.println("Even number is:" + n1);
        } else {
            System.out.println("odd number is :" + n1);
        }
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n1=in.nextInt();
        oddeven n = new oddeven();
        n.main(n1);
    }
}
