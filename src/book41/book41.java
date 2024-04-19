package book41;

import java.util.Scanner;

public class book41 {
    public static void main(String[] args) {
        System.out.println("学号：202300245   姓名：王康");
        System.out.println("请输入一个四位整数:\n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("个位数是："+a%10);
        System.out.println("十位数是："+a/10%10);
        System.out.println("百位数是："+a/100%10);
        System.out.println("千位数是："+a/1000%10);
    }
}
