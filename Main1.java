//write your code here
import java.util.*;
class Main1{
    public static void main(String[]args){
        Scanner in = new Scanner (System.in);
        int n =in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
        System.out.println(arr[n-2]);

    }

}