import java.util.ArrayList;

public class Main {

    public static void main (String[] args){

        ArrayList<MyThread> myThreads = new ArrayList<MyThread>();

        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            myThreads.add(new MyThread("# " + Integer.toString(i)));
        }

        for(int i = 0; i < Integer.parseInt(args[0]); i++) {
            myThreads.get(i).start();
        }
    }
}

