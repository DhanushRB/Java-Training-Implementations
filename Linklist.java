
//creating a class node-step-1
class Node{
    int data;
    Node next;


//creating a constructor-step-2
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class Linkedlist{
    Node head,tail;
    public  void insert(int data){
        Node n = new Node(data);
        if(head==null){
            head=n;
            tail=n;
        }
        else{
            tail.next=n;
            tail=n;

        }

    }
    public void display(){
        Node temp=head;
        while(temp!=null){

            System.out.print(temp.data);
            System.out.print("->");
            temp = temp.next;
        }
    }
    //insertAtbeginning
    public void insertAtbeginning(int data){
        Node n=new Node(data);
        n.next=head;
        head=n;
    }
    //deleteAtbeginning
    public void deleteAtbegin(){
        if(head!=null){
            head=head.next;
        }
    }
    //deleteAtend
    public void deleteAtend(){
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;

        }
        temp.next=null;
    }
}
public class Linklist {  //step-3
    public static void main(String[] args) {
        Linkedlist link = new Linkedlist();
        link.insert(100);
        link.insert(200);
        link.insert(300);

        link.insertAtbeginning(500);
        link.deleteAtbegin();
        //link.deleteAtend();
        link.display();
    }
}
                   //or

    // Linkedlist<Strin
