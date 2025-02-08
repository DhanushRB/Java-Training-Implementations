
import java.lang.String;
public class alphabeticString {
    public static void main(String[]args){
        String str="helloworld";
        if(str.matches("[a-zA-Z]+"))
        {
            System.out.println("the statement is alphabetic");
        }
        else{
            System.out.println("false statement");
        }
    }
}
