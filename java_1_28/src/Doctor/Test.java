package Doctor;

public class Test {
    public static Person[] train() {
        Person[] array = new Person[10];
        for(int i = 0;i < 5;i++){
            array[i] = new Teacher();
        }
        array[5] = new Doctor();
        for(int i = 6; i < 10;i++){
            array[i] = new Student();
        }
        return array;
    }

    public static void main(String[] args) {
        Person[] array = train();
        for (int i = 0; i < array.length;i++){
            if(array[i] instanceof Doctor){
                System.out.printf("下标为%d的乘客是医生\n",i);
                Doctor d = (Doctor) array[i];
                d.rescue();
            }
        }
    }
}
