package Thread;

// Creating Threads by Implementing Runnalbe Interface  in java .
public class MainThread {
    public static void main(String[] args) {
        Test t = new Test();
        Thread obj = new Thread(t);
        obj.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread ");
        }

    }
}

// test class runnable implements
class Test implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Test Thread");
        }
    }
}