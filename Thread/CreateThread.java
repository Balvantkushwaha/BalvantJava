package Thread;

// Creadting Threads by Extending Thread Class in java .
public class CreateThread {
    public static void main(String[] args) {
        myThreadA obja = new myThreadA();
        myThreadB objb = new myThreadB();
        obja.start();
        objb.start();
    }

}

// class myThread A

class myThreadA extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Form Thread A" + i);
        }
        System.out.println("Exit form A");
    }
}
// class myThread B

class myThreadB extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Form Thread B" + i);
        }
        System.out.println("Exit form B");
    }
}
