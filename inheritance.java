import java.util.*;
public class inheritance {
    void dheena(){
        System.out.println("i am a dheena");
    }
    public static class inA extends inheritance{
        void dhanush(){
            System.out.println("i am dhanush");
        }
    public static class inAa extends inA{
            void sanjay() {
                System.out.println("i am sanjay");
            }
    }
    }
    public static  void main(String[]args){
        Scanner in = new Scanner(System.in);
        inheritance i = new inheritance();
        inA a = new inA();
        inA.inAa b =new inA.inAa();
        i.dheena();
        a.dhanush();
        b.sanjay();


    }
}
