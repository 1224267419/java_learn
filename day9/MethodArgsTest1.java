public class MethodArgsTest1{
    public static void main(String[] args) {
        
        String a="a";
        String b="b";
        new Person3().way0(a,b);
        System.out.println(a);
        System.out.println(b);//实际上这样子是没用的(a和b还是不会变)
    }
}
class Person3{
    //属性
    String name;
    //方法
    public  void way0(String ... strs) {//传入多个形参（可以为1）
        for (int i=0;i<strs.length;i++){
        strs[i]="hi";//调用方法和遍历数组无异,然而还是不改变实参
        
        }
        System.out.println();
    }

    public  void way1(int a,int b) {
        //直接在方法里面输出，再用System.exit(0);强行退出程序 

        
            a=a*10;
            b=b*20;
            System.out.println(a);
            System.out.println(b);
            System.exit(0);

    }
}



