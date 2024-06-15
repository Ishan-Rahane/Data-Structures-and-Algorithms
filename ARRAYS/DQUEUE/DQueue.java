package ARRAYS.DQUEUE;

public class DQueue {

     int [] arr;
     int F;
     int R;

    public DQueue() {
        arr = new int[5];
        F = -1;
        R = -1;
    }

    //to insert value from Front end in array using Queue
    public void insertFromF(int value){
        //check if queue is full
        if(F == 0 && R == arr.length-1){
            System.out.println("DQueue is full!!!");
        }
        else {
            //check if this the first element
            if(F==-1){
                F = R = 0;
                arr[F] = value;
            }
            else {
                if (F==0){
                    //no space before F then shift all elements forward
                    for (int i = R; i >=F ; i--) {
                        arr[i+1] = arr[i];
                    }
                    R = R+1;
                    arr[F] = value;
                }
                else {
                    //we have some spcae before F so shift F back
                    F = F-1;
                    arr[F] = value;
                }
            }
        }
    }

    //to insert value from Rear end in array using Queue
    public void insertFromR(int value){
        //check if queue is full
        if(R == arr.length-1){
            if(F==0){
                System.out.println("Queue is full!");
            }
        }
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
    public int removeFromF(){
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

    //to remove value from Rear end in array using Queue
    public int removeFromR(){
        int value=0;
        //check if queue is empty
        if(R == -1)
            System.out.println("Queue is empty!");

        else {
            //check if this is last element in queue
            value = arr[F];
            if (F == R){
                F = R = -1;
            }
            else {
                R = R-1;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + "F = " + F + ", R = "+R +"\n";
        if (F == -1){
            str+="Queue is empty!!";
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

        DQueue q = new DQueue();
        System.out.println(q);

        q.insertFromF(11);
        q.insertFromF(22);
        q.insertFromR(33);
        q.insertFromR(44);
        q.insertFromF(55);

        System.out.println(q);

        q.insertFromR(77);
        q.insertFromF(66);
    }


}
