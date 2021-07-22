package AccessCard;

public class Test {
    public static AccessCard[] createCard() {
        AccessCard[] array = new AccessCard[10];
        for(int i = 0;i < 5;i++){
            array[i] = new StudentAccessCard();
        }
        for(int i = 5;i < 10;i++){
            array[i] = new TeacherAccessCard();
        }
        return array;
    }
    public static void main(String[] args) {
        AccessCard[] array = createCard();
        for(int i = 0; i < array.length;i++){
            array[i].entrance();
            System.out.println("==========");
        }
    }
}
