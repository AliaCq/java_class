import java.util.TreeSet;

public class 牛客网 {
    public static void numJewelsInStones(String expect, String real) {
        TreeSet<Character> set = new TreeSet<>();
        TreeSet<Character> set1 = new TreeSet<>();

        String expected = expect.toUpperCase();
        String realed = real.toUpperCase();

        for(char reals:realed.toCharArray()){
            set.add(reals);
        }

        for (char ch:expected.toCharArray()){
            if (!set.contains(ch)){
                set1.add(ch);
            }
        }
        System.out.println(set1);
    }

    public static void main(String[] args) {
        String s1 = "7_This_is_a_test";
        String s2 = "_hs_s_a_es";
        numJewelsInStones(s1,s2);
    }
}
