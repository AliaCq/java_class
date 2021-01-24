//在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
public class 求最大值方法的重载 {
    public static int max(int x,int y) {
        return x>y?x:y;
    }
    public static double max(double x,double y) {
        return (x-y)>0?x:y;
    }
    public static void max(int x,int y,double z) {
        int a = max(x,y);
        if(a-z>0){
            System.out.println(a);
        }
        else{
            System.out.println(z);
        }
    }

    public static void main(String[] args) {
        System.out.println(max(3,5));
        System.out.println(max(3.5,2.0));
        max(3,5,6.0);
    }
}
