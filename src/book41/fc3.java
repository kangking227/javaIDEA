package book41;


public class fc3 {
    public static void main(String[] args) {
        System.out.println("学号：20230" +
                "                  0245  姓名：王康");
        double a = 25.6, b = 3, c = 8, d = 13.4, e = 28, f = 65;
        double det = a * d - b * c;
        double x = (d * e - b * f) / det;
        double y = (a * f - c * e) / det;
        System.out.println("解为：x=" + x + ", y=" + y);
    }
}




