import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class collection2 {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(66);
        list.add(4);
        list.add(4);
        list.add(9);
        list.add(10);


        //to find the maximum number
       // int max= Collections.max(list);
        //System.out.println("Maximum number of arraylist:"+max);


        //remove the duplicate element
        LinkedHashSet<Integer> list1 = new LinkedHashSet<>(list);
        list1.clear();
        list1.addAll(list);
        System.out.println("remove the duplicate element:"+list1);

    }
}
