package book41;

import java.util.Scanner;

public class maxrate {
    public static void main(String[] args) {
        System.out.println("请输入泥要累加的数字：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("你输入的是："+n);
        int i = 0;
        int sum=0;
        while(i<n)
        {
            i++;
            sum=sum+i;
        }
        System.out.println("累加的值是："+sum);
        input.close();
    }
}
