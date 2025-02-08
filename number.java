import java.util.*;
public class number{

         void display(int a ){
            // a=-(++a);
             System.out.println(~a);

    }
    public static void main(String[]args){
             Scanner in = new Scanner(System.in);
             System.out.println("enter the number:");
             int a= in.nextInt();

             number n= new number();
             n.display(a);
    }
}
