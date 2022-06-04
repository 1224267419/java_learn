class Varlablelestl{
    public static void main(String[]args){
        //1.整型：byte(1字节=8bit)\short(2字节)\int(4字节)\1ong(8字节）
        //@byte范围：-128w127
        //
        byte b1=12;
        byte b2 =-128;
        //b2=128;//编译不通过
        System.out.println(b1);
        System.out.println(b2);
        //②声明1ong型变量，必须以"1"或"L"结尾
        //@通常，定义整型变量时，使用int型。
        short s1 = 128;
        int i1=1234;
        long l1=3414234324L;
        System.out.println(11);
        
        //2.浮点型：f1oat(4字节)\doub1e(8字节)
        //@浮点型，表示带小数点的数值
        //@f1oat表示数值的范围比1ong还大
        double d1=123.3;
        System.out.println(d1+1);
        //输出时也可以+1
        //定义f1oat类型变量时，变量票以"f"或"F"结尾
        float f1=12.3f;
        System.out.println(f1);
        //通常，定义浮点型变量时，使用double型。

        
        //3.字符型：char（1字符=2字节)
        //@定义char型变量，通常使用一对''，内部只能写一个字符
        char c1 ='a';
        
        //c1='AB';//编译不通过
        System.out.println(c1);
        char c2 ='1';
        char c3='中';
        
        char c4='入';
        char c5='\t';
        char c6='\u0123';
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.print("hello" + c5);
        System.out.println("world");
        System.out.println(c6);

        boolean bb1=true;
        boolean bb2=false;
        System.out.println(bb1);
        System.out.println(bb2);
        //布尔型,只有两个值
        
        int i3=129;
        byte b3=2;
        //byte b2=b1+i1; //高类型必须向更高类型转换
        //i4=b3+i3;  //自动类型转换也必须定义类型
        int i4=b3+i3;
        long l4=b3+i3;
        float f4=b3+i3;
        int i5=c1+i3;//char和byte都试过了,short就不试了
        double d5=i5;//强制转换成double类型
        int i6= (int)d5;//截断,省去了后面小数部分
        int i= 128;
        byte b6= (byte) i;
        System.out.println(i4);
        System.out.println(l4);
        System.out.println(f4);
        System.out.println(i5);
        System.out.println(d5);
        System.out.println(i6);
        System.out.println(b6);
    }
}