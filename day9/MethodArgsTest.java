public class MethodArgsTest{
    public static void main(String[] args) {
        
        new Person2().show("中文");//  
        new Person2().show("中文","123");//也不报错，能传入多个参数 
        //new Person2().show("中文","123",1);//显然有问题，1不是string
    }
}
class Person2{
    //属性
    String name;
    //方法

    public  void show(String ... strs) {//传入多个形参（可以为1）
        for (int i=0;i<strs.length;i++){
        System.out.print(strs[i]+'\t');//调用方法和遍历数组无异
        
        }
        System.out.println();
    }
    /* 
    public  void show(String [] strs) {//传入多个形参（可以为1）
        System.out.println("String ... strs");
        weight++;//方法可以修改属性
        
    }
    这种方法和上面的效果是差不多的，用数组装可变个数形参
*/
/* 
public  void show(String ... strs,int ... a) {//传入多个形参（可以为1）
    System.out.println("String ... strs");
    weight++;//方法可以修改属性
    
}

//The variable argument type String of the method show must be the last parameter
//可变参数必须是最后一个参数,故也不可以有多个可变参数
    */
    }


