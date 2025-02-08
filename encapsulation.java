import java.util.*;
public class encapsulation{
    private int h,b;
    void setvalue(int a,int c){
       this.h=a;
       this.b=c;
    }
    void calculation(){

        double a=0.5*h*b;
        System.out.println("Area of triangle is :" +a);

    }
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the height:");
        int h=in.nextInt();
        System.out.println("enter the breath:");
        int b=in.nextInt();
        encapsulation e= new encapsulation();
        e.setvalue(h, b);
        e.calculation();

    }
}
