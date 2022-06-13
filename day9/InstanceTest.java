public class InstanceTest{
    public static void main(String[] args) {
        new Person().eat();
        new Person().sleef();//匿名对象,直接调用方法， 
        System.out.println(new Person().age);//匿名对象,直接调用属性也是可以的，虽然一般不这么做， 


//        实际开发一般是使用是用另外一个对象，通过方法调用来实现，具体实现如下
        Personal mall =new Personal();
        mall.show(new Person());

    }
}
class Personal{
public void show(Person person){
    System.out.println(new Person().age);
    person.eat();
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
    public  int get_weight() {//带返回值的方法（必须改前面的void为返回的数据类型，必须要有return）
            return weight;
        
    }
}

