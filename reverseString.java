
import java.lang.String;
import java.util.*;
public interface reverseString {
    public static void main(String[]args){
        java.lang.String str="HELLO";
        java.lang.String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("reverseString is:"+rev);
    }
}
