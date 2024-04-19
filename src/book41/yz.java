package book41;

import java.util.Scanner;

public class yz {
    public static void main(String[] args) {
        System.out.println("输入一个整数：\n");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int y;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                System.out.println(i);

        }
    }
}