import java.lang.String;
import java.util.*;
public class profitLoss {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the principle amount :");
        int p=in.nextInt();
        System.out.println("enter the rate");
        float r=in.nextFloat();
        float profit =(p*r/100);
        float loss =(p*r/100);

        if (profit>p){
            System.out.println("the profit amount is:"+profit);

        }
        else{
            System.out.println("the loss amount is :"+loss);
        }


    }
}
