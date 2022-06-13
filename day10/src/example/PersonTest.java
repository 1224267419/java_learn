package example;

public class PersonTest {
    public static void main(String[] args) {
    Person p=new Person();
     p.setAge(10);
    p.setAge(999);
        System.out.println(p.getAge());
    }
}
class Person{
    private int age ;

    public void setAge(int age) {
        if (age > 0 & age < 130) {
            this.age = age;
        }
        else{
            System.out.println("传入的数据非法");
        }
    }

    public int getAge() {
        return age;
    }
}