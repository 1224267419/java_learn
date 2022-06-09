public class OOPTest{
    public static void main(String[] args) {
        Person p1=new Person();//创建类的的对象=类的实例化=实例化类
        System.out.println(p1.weight);//直接调用属性
        p1.eat();
        System.out.println(p1.weight);//调用方法修改对象属性
        System.out.println(p1.name);//属性初始值参考数组元素的初始值
        System.out.println(p1.isMale);//
        p1.name="小李";
        p1.isMale=true;
        System.out.println(p1.name);//直接修改对象的属性
        System.out.println(p1.isMale);
        p1.talk("中文");//接受参数的操作
        
    }
}
class Person{
    //属性
    String name;
    int age=10;
    boolean isMale;
    int weight=60;

    //方法
    public  void eat() {
        System.out.println("人可以吃饭");
        weight++;//方法可以修改属性
        
    }
    public  void sleef() {
        System.out.println("人可以睡觉");
        
    }
    public  void talk(String language) {
        System.out.println("这个人说"+language);
        
    }
}

