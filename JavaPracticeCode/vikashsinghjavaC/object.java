package vikashsinghjavaC;

class mahesh {
    void fun1() {
        int x; // intance variable
        int y;
        System.out.println("fun1"); // intance function or non static function

    }

    void fun2() {
        System.out.println("fun2");
    }

}

public class object {
    int x = 5;

    static void fun1() {

        System.out.println("static function");
    }

    public static void main(String[] args) {

        object obj = new object();
        obj.fun1();
        System.out.println(obj.x);

    }
}
