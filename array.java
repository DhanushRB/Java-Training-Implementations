import java.util.*;
public class array {
    public static void main(System[]args){
        Scanner in = new Scanner(System.in);
        int a[]={1,11,22,3,2,5,6,10,8};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
               if(a[i]>a[j]) {
                   a[i] = a[j];
               }
            }
        }


    }


}
