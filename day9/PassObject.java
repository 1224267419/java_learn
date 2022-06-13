public class PassObject{
    public static void main(String[] args) {
        C1 c=new C1 ();
        c.r=100;
        System.out.println(new C2().get_S(c));
        System.out.println(c.r);//类也是引用数据类型
    }
}
class C1{
    int r=0;

    public int get_R(){
        return r;
    } 
}
class C2{
    int S=0;

    public double get_S(C1 c){
        //double d=c.r*c.r*3.14;
        c.r+=1;
        return c.r*c.r*3.14;
    } 
}


