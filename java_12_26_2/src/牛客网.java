import java.util.Scanner;
//打印菱形
//public class 牛客网 {
//    public static void main(String[] args) {
//        char ch='*';
//        Scanner sca = new Scanner(System.in);
//        while(sca.hasNext()){
//            int lines=sca.nextInt();
//            int d=1;
//            int i=0;
//            while (d <= lines) {
//                for (i = 0; i < lines - d + 1; i++) {
//                    System.out.print(" ");
//                }
//                for (i = 0; i < d; i++) {
//                    System.out.print(ch + " ");
//                }
//                System.out.println();
//                d++;
//            }
//            for(i=0;i<lines+1;i++){
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//            int e=1;
//            while (e <= lines) {
//                for (i = 0; i < e; i++) {
//                    System.out.print(" ");
//                }
//                for (i = 0; i < lines-e+1; i++) {
//                    System.out.print(ch + " ");
//                }
//                System.out.println();
//                e++;
//            }
//        }
//    }
//}
public class 牛客网 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        char ch = '*';
        while (sca.hasNext()) {
            int line = sca.nextInt();
            int d = 1;
            int e = 1;
            int i = 0;
            int j = 0;
            while(d<=line){
                for(i=0;i<line-d+1;i++){
                    System.out.print(" ");
                }
                for(j=0;j<d;j++){
                    System.out.print(ch+" ");
                }
                System.out.println();
                d++;
            }
            for(i=0;i<line+1;i++){
                System.out.print(ch+" ");
            }
            System.out.println();
            while(e<=line){
                for(i=0;i<e;i++){
                    System.out.print(" ");
                }
                for(j=0;j<line-e+1;j++){
                    System.out.print(ch+" ");
                }
                System.out.println();
                e++;
            }
        }
    }
}