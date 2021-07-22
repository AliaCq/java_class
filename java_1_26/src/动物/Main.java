package 动物;

public class Main {
    public static void main(String[] args) {
        猫 cat = new 猫();

        cat.卖萌();

        // 由于猫 is 逮老鼠动物，猫具备 走、跑、逮老鼠的能力
        cat.走();
        cat.跑();
        cat.逮老鼠();

        // 由于猫 is 动物，猫具备 叫的能力
        cat.叫();

        狗 dog = new 狗();
        dog.拆家();

        // 由于狗 is 逮老鼠动物，狗具备 走、跑、逮老鼠的能力
        dog.走();
        dog.跑();
        dog.逮老鼠();

        // 由于狗 is 动物，狗具备 叫的能力
        dog.叫();


    }
}
