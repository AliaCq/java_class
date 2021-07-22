package v1;

public class Teacher {
    public String name;
    public int age;
    public String[] courseArray;

    public void 自我介绍(){
        //在普通方法中可以使用属性
        System.out.printf("我叫%s,今年%d岁,我教以下课程:\n",name,age);
        if(courseArray != null){
            for(String course:courseArray){
                System.out.println(course);
            }
        }
    }
}
