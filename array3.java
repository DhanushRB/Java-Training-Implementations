import java.util.*;
public class array3 {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = in.nextInt();
        int a[] = new int[n];
        int b = 0;
        System.out.println("enter the values of array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {

                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }

            }

        }
        // it is print the  ascending order
        // for(int i=0; i<a.length;i++){

        // System.out.println(a[i]);


        //it is second largest array
        // System.out.println(a[n-2]);


        //removing duplicate value
        //System.out.println("duplicate value removed number:");
        //for(int i=0;i<a.length;i++){
        //  if(i==0||a[i]!=a[i-1]){
        //    System.out.print(a[i]);
        //}
        System.out.println("duplicate numbers are:");
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                System.out.println(a[i]);
                continue;
            }

            }
        }




    }





