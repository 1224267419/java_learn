package BlockTest;

public class BlockTest {
    public static void main(String[] args) {
        //Person p1=new Person();//代码块随着类的调用而执行,
        //new Person("1",2);
        String desc=Person.desc;//调用静态属性(方法),也就调用了静态代码块
        Person p1=new Person();
        Person p2=new Person();
        Person.desc="2";//仅被调用一次
    }
}

class Person{
    String name;
    int age;
    static String desc="我是人";//描述

    public Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    {
        System.out.println("{}");
    }

    //只能用static修饰,即静态代码块
    static {
        System.out.println("static 的{}");
        seat();//只能调用静态的属性和方法
        System.out.println(desc);
        //System.out.println(name);
        //eat();
    }



    public void eat(){
        System.out.println("我吃饭");
    }
    static public void seat(){
        System.out.println("我吃饭 static");
    }



}
