import java.util.Set;
import java.util.TreeSet;

public class 牛客网1 {
    public static void main(String[] args) {
        String s1 = "7_This_is_a_test";
        String s2 = "_hs_s_a_es";
        String expected = s1.toUpperCase();
        String real = s2.toUpperCase();

        Set<Character> set = new TreeSet<>();
        Set<Character> set1 = new TreeSet<>();

        for(char reals:real.toCharArray()){
            set.add(reals);
        }

        for (char ch:expected.toCharArray()){
            if (!set.contains(ch) && !set1.contains(ch)){
                System.out.print(ch);
                set1.add(ch);
            }
        }
    }
}

