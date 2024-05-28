package ARRAYS.QUEUE;

public class Queue {

     int [] arr;
     int F;
     int R;

    public Queue() {
        arr = new int[10];
        F = -1;
        R = -1;
    }

    //to insert value from Rear end in array using Queue

    public void insert(int value){
        //check if queue is full
        if(R == arr.length-1)
            System.out.println("Queue is full!");

        else {
            //check if this is first element to be inserted
            if(R == -1){
                R = F = 0;
                arr[R] = value;
            }
            else {
                R = R + 1;
                arr[R] = value;
            }
        }
    }


    //to remove value from Front end in array using Queue

    public int remove(){
        int value=0;
        //check if queue is empty
        if(F == -1)
            System.out.println("Queue is empty!");

        else {
            //check if this is last element in queue
            value = arr[F];
            if (F == R){

                F = R = -1;
            }
            else {
                F = F + 1;
            }

        }
        return value;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + "F = " + F + ", R = "+R +"\n";
        if (F == -1){
            System.out.println("Queue is full!");
        }
        else{
            for (int i = F; i <= R; i++) {
                str += arr[i]+", ";
            }
            str += "\n";
        }
        return str;
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.insert(10);
        q.insert(25);
        q.insert(38);
        q.insert(45);

        q.remove();
        q.remove();


        q.insert(7);
        q.remove();

        System.out.println(q);



    }


}
