import java.util.*;
public class simpleinterest {
    void main(float p,float r,int t){

        float si= (p*r*t)/100;
        System.out.println("Simple interest of "+ p+ " is:" +si);
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the principal amount:");
        float p = in.nextFloat();
        System.out.print("Enter the Rate:");
        float r = in.nextFloat();
        System.out.print("Enter the Time:");
        int t = in.nextInt();
        simpleinterest S =new simpleinterest();
        S.main(p,r,t);


    }
}
