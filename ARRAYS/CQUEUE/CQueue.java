package ARRAYS.CQUEUE;

public class CQueue {

    int []arr;
    int F,R;

    public CQueue() {
        arr = new int[5];
        F=-1;
        R=-1;
    }

    public void insert(int value){
        //check if queue is full
        if((F==0 && R==arr.length-1) || R+1==F){
            System.out.println("CQueue is full!!");
        }
        else{
            //check if fully empty and inserting for first element
            if (R==-1)
                F=R=0;
            else {
                //We reached BORDER??
                if (R==arr.length-1) //if yes
                    R=0;
                else //if no, keep incrementing R
                    R = R+1;
            }
            arr[R] = value;
        }
    }

    public int remove(){
        int value=0;
        //check if queue is full
        if(F==-1)
            System.out.println("Queue is full!!");
        else {
            value = arr[F];
            //check if this is the last element
            if(F==R)
                F=R=-1;
            else if (F== arr.length-1)
                F=0;
            else
                F = F+1;
        }
        return value;
    }


    public String toString(){
        String str = "";
        str+= "F="+F+", R="+R+"\n";
        if (F==-1)
            str+="Queue is empty!";
        else{
            int i=F;
            while (true){
                str+=arr[i]+", ";
                if(i==R)
                    break;
                if(i== arr.length-1)
                    i=0;
                else
                    i = i+1;
            }
            str+="\n";
        }
        return str;
    }

    public static void main(String[] args) {
        CQueue cq = new CQueue();

        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

        cq.insert(60);
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

        cq.remove();
        System.out.println(cq);

    }

}
