class twoStacks {
    int length;
    int top1, top2;
    int a[];
    public twoStacks(int n) {
        length= n;
        a = new int[n];
        top1 = -1;
        top2 = n;
    }
    public void push1(int data) {
        if (top1 < top2 - 1) {
            top1++;
            a[top1] = data;
        } else {
            System.out.println("Stack 1 Overflow");
        }
    }
    public void push2(int data) {
        if (top1 < top2 - 1) {
            top2--;
            a[top2] = data;
        } else {
            System.out.println("Stack 2 Overflow");
        }
    }

    public void pop1() {
        if (top1 >= 0) {
            int p1 = a[top1];
            top1--;
            System.out.println("pop the element:"+p1);

        } else {
            System.out.println("Stack 1 Underflow");

        }
    }

    public void pop2() {
        if (top2 < length) {
            int p2 = a[top2];
            top2++;
            System.out.println("pop the element:"+p2);
        } else {
            System.out.println("Stack 2 Underflow");
        }
    }

    // Display Stack 1
    public void displayStack1() {
        if (top1 == -1) {
            System.out.println("Stack 1 is empty");
        } else {
            System.out.print("Stack 1: ");
            for (int i = 0; i <= top1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    public void displayStack2() {
        if (top2 == length) {
            System.out.println("Stack 2 is empty");
        } else {
            System.out.print("Stack 2: ");
            for (int i = top2; i < length; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

public class twoStack {
    public static void main(String[] args) {
        twoStacks ts = new twoStacks(10);

        ts.push1(5);
        ts.push1(10);
        ts.push1(15);

        ts.push2(50);
        ts.push2(40);
        ts.push2(30);

        ts.displayStack1();
        ts.displayStack2();

        ts.pop1();
        ts.pop2();

        ts.displayStack1();
        ts.displayStack2();
    }
}

