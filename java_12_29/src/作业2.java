import java.util.Scanner;

public class 作业2 {
    public static void main(String[] args) {
        String password = "123456";
        Scanner sca = new Scanner(System.in);
        int count = 0;
        boolean isright = false;
        System.out.print("请输入密码：");
        while(count < 3 && sca.hasNext()){
            String inputpassword = sca.next();
            if(inputpassword.equals(password)){
                isright = true;
                break;
            }
            System.out.print("请输入密码：");
            count++;
        }
        if(count == 3){
            System.out.println("三次输入错误，锁屏");
        }
        else if(isright){
            System.out.println("输入正确");
        }
        else{
            System.out.println("欢迎下次光临");
        }
    }
}
