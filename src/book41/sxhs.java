package book41;

public class sxhs {
    public static void main(String[] args) {

     {
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) {
                int a  = temp % 10;
                sum += a * a * a;
                temp /= 10;
            }
            if (sum == i) {

                System.out.println(i);
            }
        }
    }                System.out.println("学号：202300245 姓名：王康");
}
}
