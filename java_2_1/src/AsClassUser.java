import java.util.Random;
import java.util.Scanner;

public class AsClassUser {
    public static void main(String[] args) {
        {
            Random r1 = new Random();
            Random r2 = new Random();

            System.out.println(r1.equals(r2));

        }

        {
            String s1 = "hello";
            String s2 = "hello";

            System.out.println(s1.equals(s2));

        }

        {
            Scanner sca1 = new Scanner(System.in);
            Scanner sca2 = new Scanner(System.in);

            System.out.println(sca1.equals(sca2));
        }
    }
}
