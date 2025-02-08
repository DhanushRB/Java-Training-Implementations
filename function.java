import java.util.*;
public class function{
    int n1,n2;
    void number(){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number N1:");
        n1=in.nextInt();
        System.out.println("enter the number N2:");
        n2=in.nextInt();

    }
    void Addition(){

        System.out.println("Addition of two number is:" + (n1 + n2));
    }
    void Subtraction(){
        System.out.println("Substration of two number:" + (n1 - n2));

    }
    void Multiplication(){
        System.out.println("Multiplication of two number:"+(n1 * n2));
    }
    void division(){
        if(n2!=0){
            System.out.println("division of two number:"+(n1 / n2));
        }
        else {
            System.out.println("invalid input of n2");
        }

    }
    public static void main(String[]args){
        function f = new function();
        f.number();
        f.Addition();
        f.Subtraction();
        f.Multiplication();
        f.division();
    }
}
