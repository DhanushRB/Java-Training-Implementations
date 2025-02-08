import java.lang.String;
import java.util.*;
public class compareString {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String Str = "the";
    int count = 0;

    for(int i = 0; i<str.length();i++)
    {
        if (str.charAt(i).equals(Str.charAt(0))) {
            if (str.charAt(i + 1).equals(Str.charAt(1))) {
                if (str.charAt(i + 2).equals(Str.charAt(2))) {
                    count++;
                }
            }
        }
    }
    System.out.println(count);
}
}



