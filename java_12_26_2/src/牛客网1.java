import java.util.Scanner;
//输出一个基本信息
//public class 牛客网1 {
//    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        String name = sca.next();
//        int age = sca.nextInt();
//        String gender = sca.next();
//        int i=0;
//        System.out.println("Name    Age    Gender");
//        for(i=0;i<21;i++){
//            System.out.print("-");
//        }
//        System.out.printf("\n%-8s%-7d%s\n",name,age,gender);
//    }
//}

public class 牛客网1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String name = sca.next();
        int age = sca.nextInt();
        String gender = sca.next();
        int i = 0;
        System.out.printf("Name    Age    Gender\n");
        for (i=0;i<21;i++){
            System.out.printf("-");
        }
        System.out.println();
        System.out.printf("%-8s%-7d%s\n",name,age,gender);
    }
}