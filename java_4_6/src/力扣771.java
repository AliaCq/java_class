import java.util.TreeSet;

public class 力扣771 {
    public int numJewelsInStones(String jewels, String stones) {
        TreeSet<Character> set = new TreeSet<>();

        for(char jewel:jewels.toCharArray()){
            set.add(jewel);
        }
        int count = 0;

        for(char stone:stones.toCharArray()){
            if(set.contains(stone)){
                count++;
            }
        }
        return count;
    }
}
