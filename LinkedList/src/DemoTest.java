public class DemoTest {

    public static void main(String[] args) {

        swap3(30, 8);

    }

    //利用第三个数
    private static void swap1(int a, int b) {
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a: " + a + ",b: " + b);
    }

    //利用加减法（乘除法一个道理）
    private static void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ",b: " + b);
    }

    //异或方法
    private static void swap3(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: " + a + ",b: " + b);
    }
}
