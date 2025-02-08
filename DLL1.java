class Node {
    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class DoublyLL {
    Node head, tail;

    //Insert at beginning
    public void insertAtBegin(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    //Insert at end
    public void insertatend(int data) {
        Node newnode = new Node(data);

        if (tail == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void insertmiddle(int data, int pos) {
        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newnode;
        }
        temp.next = newnode;
        newnode.prev = temp;
        if (newnode.next == null) {
            tail = newnode;
        }

    }

    public void delete() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    public void deleteEnd() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

    }

    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
        }
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print("<->");
            }
            temp = temp.next;
        }
        System.out.println();
    }


    public class DDL1 {
        public static void main(String[] args) {
            DoublyLL DLL = new DoublyLL();
            DLL.insertatend(300);
            DLL.insertatend(400);
            DLL.insertAtBegin(100);
            DLL.insertmiddle(200, 1);
            DLL.display();
            DLL.delete(); // delete begin if we put delete()also it can delete the begining
            DLL.deleteEnd();
            DLL.display();
        }

    }
}
