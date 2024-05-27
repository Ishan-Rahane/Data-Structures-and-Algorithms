package STACK;

public class StackDSA {

    static int []arr = new int[5];
    static int top = -1;

    public StackDSA(int[] arr, int top) {
        this.arr = arr;
        this.top = top;
    }

    public StackDSA() {
    }

    public static void push(int value){
        if(top < arr.length-1){
            top = top+1;
            arr[top] = value;
        }
        else
            System.out.println("Stack Overflow!");
    }

    public static int pop(){
        int value=0;
        if (top != -1){
            arr[top] = value;
            top=top-1;
        }
        else
            System.out.println("Stack is empty");

        return value;
    }

    public static void print(){
        if(top==-1)
            System.out.println("Stack is empty!");
        else {
            for (int i = 0; i < top; i++) {
                System.out.println(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("---Use for PUSH");
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
//        push(60); //stack overflow
        print();

        System.out.println("---Use for POP");
//        pop();
//        print();
    }
}
