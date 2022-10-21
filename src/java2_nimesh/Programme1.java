package java2_nimesh;

public class Programme1 {
    static int a = 10;
    static int b = 20;
    public static void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Programme1 class1 = new Programme1();
        Programme1.instanceMethod();
    }
}

