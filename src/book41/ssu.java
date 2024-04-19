package book41;

public class ssu {
    public static void main(String[] args) {
    int num = 2,i;
    int count=1;
    while(num<=100){
        i=2;
        while(i<num){
            if(num%i==0)
            {
                break;
        }
            System.out.println(num);
            i++;
    }
    }
}
}
