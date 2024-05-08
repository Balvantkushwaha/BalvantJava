package vikashsinghjavaC;

/**
 * Innerexample
 */
class area {
    static void fun1() {
        System.out.println("area1");
    }

    static void fun2() {
        System.out.println("area 2");
    }

}

public class example {
    static void fun1() {
        System.out.println("B");
    }

    static void fun2() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        System.out.println();
        fun1();
        fun2();
        area.fun1();
        area.fun2();
    }
}
