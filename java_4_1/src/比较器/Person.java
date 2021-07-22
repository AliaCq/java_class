package 比较器;

import java.util.Arrays;

public class Person implements Comparable <Person>{
    public String name;
    public int score;
    public char birthPet;

    public Person(String name,int score,char birthPet) {
        this.name = name;
        this.score = score;
        this.birthPet = birthPet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", birthPet=" + birthPet +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        String s = "鼠牛虎兔龙蛇马羊猴鸡狗猪";
        int i = s.indexOf(this.birthPet);
        int i1 = s.indexOf(o.birthPet);
        return i - i1;
    }
}
