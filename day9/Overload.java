public class Overload{
    public static void main(String[] args) {
        
        new Person1().talk("中文");//匿名对象,直接调用方法， 
        new Person1().talk(1);//重载函数
            
    }
}
class Person1{
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

    /* 
    public  void talk(int a) {  //注释这个函数结果会不一样，可以先解注释试试
        System.out.println("int");
        
    }
    */
    public  void talk(double a) {
        System.out.println("double");
        
    }

    public  void talk(String language) {
        System.out.println("这个人说"+language);
    }

    public  int get_weight() {//带返回值的方法（必须改前面的void为返回的数据类型，必须要有return）
            return weight;
        
    }
}

