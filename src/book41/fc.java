package book41;

import java.util.Scanner;

public class fc {
    public static void main(String[] args) {
        System.out.println("学号：202300245  姓名：王康");
        System.out.println("请输入一个三位整数:\n");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b,c,e;
        b=a%10;
        c=a/10%10;
        e=a/100%10;
        System.out.println("倒序是："+b+c+e);

    }
}
