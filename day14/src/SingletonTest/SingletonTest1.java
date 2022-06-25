package SingletonTest;

public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1=Bank.getInstance();
        Bank bank2=Bank.getInstance();

        System.out.println(bank1==bank2);//地址一样,实际上只有一个对象被创建


        Order order1=Order.getInstance();
        Order order2=Order.getInstance();

        System.out.println(order1==order2);//地址一样,实际上只有一个对象被创建
    }

}
class Bank{

    private Bank(){//私有化构造器,线程安全


    }
    //内部方法创建对象(创建对象也得是静态的,静态方法只能调用静态方法)
    private static Bank instance=new Bank();//先创建对象

    //公共静态方法,返回类的对象(设置为static,就可以通过类来执行方法(而不是对象))
    public static Bank getInstance(){
        return instance;
    }
}

class Order{

    private Order(){

    }

    private static Order instance =null;

    public static  Order getInstance(){//用的时候才创建对象,延迟创建,节省内存,但是线程不安全
        if (instance==null){
        instance =new Order();

        }
        return instance;
    }
}