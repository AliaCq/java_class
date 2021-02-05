package 实例;

public class exp2 {
    public static void main(String[] args) {
        String[] names = {"孙权","公孙策","孙子先生","王子","公主","老子"};
        for(int i = 0;i < names.length;i++){
            if(names[i].startsWith("孙")){
                System.out.println(names[i]);
            }
        }
    }
}
