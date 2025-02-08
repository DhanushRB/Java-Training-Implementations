import java.util.ArrayList;
import java.util.Collections;

public class collection1 {
    public static void main(String[]args){
        ArrayList<String> list = new ArrayList<>();
        list.add("dhanush");
        list.add("bharath");
        list.add("sreejith");
        list.add("srimankabilan");
        list.add("magesh");
        list.add("sharonsiman");
        //sort the list
        Collections.sort(list);
        System.out.println("sorted the list:"+list);



    }
}
