package 实例;

public class exp1 {
    public static void main(String[] args) {
        String[] array = {"板书.png","图片.jpg","板书.word","图表.excel","png.txt","jpg.word"};
        int i = 0;
        for(i = 0;i<array.length;i++){
            if(array[i].endsWith(".png") ||array[i].endsWith(".jpg")){
                System.out.println(array[i]);
            }
        }
    }
}
