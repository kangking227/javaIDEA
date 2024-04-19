package report_test1;
import java.util.Scanner;
public class compute {
    private static int x;
    private static int y;
    public compute(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static int add() {
        return x + y;
    }
    public static int sub() {
        return x - y;
    }
    public static int multiply() {
        return x * y;
    }
    public static int division() {
        if (y == 0) {
            System.out.println("除数不能为0");
            return 0;
        }
        return x / y;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int x = scanner.nextInt();
        System.out.print("请输入第二个数：");
        int y = scanner.nextInt();
        compute compute = new compute(x, y);
        System.out.println("两个数的和：" + compute.add());
        System.out.println("两个数的差：" + compute.sub());
        System.out.println("两个数的乘积：" + compute.multiply());
        System.out.println("两个数的商：" + compute.division());
        System.out.println("学号：202300245 姓名：王康");
    }
}
