package finaltest;

public class FinalTest {
    public static void main(String[] args) {

    }
}

class FinalTest1{

    final int A=0;//常量,大写
    final int B;
    final int C;
    static final int D=10;  //全局常量

    {
        B=10;//代码块赋值
    }

    public FinalTest1() {
        C=20;//构造器赋值
    }
    public FinalTest1(int n) {
        C=n;//构造器形参赋值
    }

    static final void eat() {
        System.out.println("eat");;//全局

    }

    // final void show(){}

}



final class FinalA extends FinalTest1{
    //public  void show(){}//final修饰方法,不能被重写
}

//class B extends FinalA{} //不能被继承