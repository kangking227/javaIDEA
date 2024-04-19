package demo;

public class java {
    static int i = 10;//静态的（static）成员变量（全局变量）
    public static void main(String[] args) {


            System.out.println(i);
            // TODO 自动生成的方法存根
            //整形：byte、short、int、long
            //1字节（byte)=8位(bit) -2^7~2^7-1
            byte a = 127;                       //局部变量
            //2字节=16位 -2^15~2^15-1
            short b = 12346;
            //4字节=32位 -2^31~2^31
            //int为Java中默认的整数的数据类型
            int c = 123;
            //8字节=64位 -2^63~2^63-1
            long d = 123455L;//长整型数据后面要带字母l
            /*
             * 浮点型float double
             */
            float f1 = 2.1324f;//4字节，16位
            /*
             * 因为在Java中默认小数的数据类型为double，所以在给float类型的变量赋值时候需要在最后加上
             * 小写f或F
             */
            double f2 = 2.345;//8字节，64位
            System.out.println(a);
            System.out.println(b);
            System.out.println(c+d);
            System.out.println(""+f1+f2);

            /*
             * 字符型：char  使用Unicode字符集中的位置
             */
            char c1 = 'a';
            char c2 = 97;
            char c3 = 65;
            char c4 = 63;
            char c5 = 90;
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);
            /*
             * boolean布尔型变量：只有true 和 false
             * 不能用0和1代替
             */
            boolean flag = true ;
            flag = false ;
            System.out.println(flag);


        }
}
