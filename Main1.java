
class Queue{
    int a[]=new int[5];
    int front=-1;
    int rear=-1;

    //push
    public void push(int data){

        if(front==a.length-1){
            System.out.println("queue is empty");
        }
        else{
            rear++;
            a[rear]=data;
        }

    }
    //pop
    public void pop(){
        if(front==-1){
            System.out.println("QUeue is underflow:"+a[front]);
        }
        else{
            front++;
        }
    }
    //peak
    public void peak(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("top of the element:"+a[rear]);
        }

    }
    //display
    public void display(){
        for(int i=front;i>=rear;i++){
            System.out.println("Display the element:"+a[i]);
        }
        System.out.println();
    }
}
public class Main1 {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        q.pop();
        q.peak();
        q.display();
    }
}
