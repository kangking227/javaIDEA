import java.util.Random;
import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {
            int number=new Random().nextInt(10)+1;
            int count=0;
            int a;
        System.out.println("嘿，我已经想好了一个十以内的整数");
            do
            {
                System.out.println("猜猜这个数是多少？\n");
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                count++;
                if (a>number){
                    System.out.println("你猜的数字大了。");
                }else if (a<number){
                    System.out.println("你猜的数字小了。");}

            } while (a != number);
        System.out.printf("太好了，你用了%d次就猜对了。\n",count);


    }
}
