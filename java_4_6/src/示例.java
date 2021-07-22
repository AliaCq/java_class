import java.util.Scanner;
import java.util.TreeSet;

public class 示例 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNextLine()){
            String expected = sca.nextLine().toUpperCase();
            String real = sca.nextLine().toUpperCase();

            TreeSet<Character> set = new TreeSet<>();
            TreeSet<Character> set1 = new TreeSet<>();

            for(char reals:real.toCharArray()){
                set.add(reals);
            }

            for (char expecteds:expected.toCharArray()){
                if (!set.contains(expecteds) && !set1.contains(expecteds)){
                    System.out.println(expecteds);
                    set1.add(expecteds);
                }
            }
        }
    }
}
