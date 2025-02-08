class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DLLLinkedlist{
    node head,tail;
    public void insertAtbegin(int data) {
        node newnode=new node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }
    public void display(){
        node temp=head;
        if(temp==null){
            System.out.println("list is empty");
        }
        if(temp!=null){
            System.out.println(temp.data);
            while(temp.next!=null) {
                System.out.print("<->");
            }
                temp=temp.next;
            }

            System.out.println();
        }

    }
    public void beginAtend(){
    
    }



public class DLL {
    public static void main(String[] args) {
        DLLLinkedlist doubly=new DLLLinkedlist();
        doubly.insertAtbegin(100);
        doubly.insertAtbegin(200);
        doubly.display();

    }
}