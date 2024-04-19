package report_test1;
public class box {
    private int width;
    private int length;
    private int height;

    public box(int width,int length,int height){
        this.width=width;    
        this.length=length;
        this.height=height;
    }
    public void showbox(){
        System.out.println("长是："+length+",宽是："+width+",高是："+height);
    }
    public static void main(String[] args)
    {
        box box= new box(12,34,56);
        box.showbox();
        System.out.println("学号：202300245 姓名：王康");
    }

}
