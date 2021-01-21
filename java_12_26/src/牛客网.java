import java.util.Scanner;

public class 牛客网 {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        String ch =sca.next();
        int i=0;
        int j=0;
        int k=0;
        for(i=0;i<5;i++) {
            for (j = 5 - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
