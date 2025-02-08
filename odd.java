import java.util.*;
public class odd {
    public static void main(String[] args) {

        int i;
        for (i = 1; i <= 100; i++) {
            if (i == 20 || i == 50 || i == 70) {
                continue;

            }
            else{
                System.out.print(" " +i);
            }
        }
    }
}



