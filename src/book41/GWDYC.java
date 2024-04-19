package book41;

public class GWDYC {public static void main(String[] args) {
    System.out.println("姓名：王康 学号：202300245");
    double a = 0, num = 1;
    for (int i = 4; i <= 9; i++) {
        num -= (1.0 / i);
    }
    a = 11.0 / num;
    int x = (int) Math.round(a);
    System.out.println(x);
}
}
