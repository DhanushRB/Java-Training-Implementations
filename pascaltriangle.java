import java.util.*;
public class pascaltriangle {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER THE SIZE:");
        int n = in.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            int val = 1;
            for (j=1;j<=i;j++){
                System.out.print(" * ");
                val=val*((i-j)/j);
            }
            System.out.println();
        }
    }

}
