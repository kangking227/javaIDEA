package book41;

import java.util.Scanner;

public class diaaa {
    public static void main(String[] args) {
        System.out.println("请输入你的成绩");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        if(score<100&&score>0) {
            switch (score / 10) {
                case 9:
                    System.out.println("成绩优秀");
                    break;
                case 8:
                    System.out.println("成绩合格");
                    break;
                case 7:
                    System.out.println("勉强及格吧");
                    break;
                case 6:
                    System.out.println("差点及格");
                    break;
                default:
                    System.out.println("不及格");
            }
        }else System.out.println("成绩非法");
    }
}
