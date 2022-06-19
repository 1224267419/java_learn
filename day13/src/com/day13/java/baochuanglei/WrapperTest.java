package com.day13.java.baochuanglei;
import org.junit.jupiter.api.Test;

public class WrapperTest {
    //基本数据类型变包装类-->调用包装类的构造器

    @Test
    protected void test1() {
        int  num1=10;
        Integer in1=new Integer(num1);
        System.out.println(in1.toString());

        Integer in2=new Integer("123");//string也能转化
        System.out.println(in2);

//        Integer in3=new Integer("123abc");//不符合类型就报错
//        System.out.println(in2);

        Float f1=new Float(12.3f);
        Float f2=new Float("12.3f");
        Float f3=new Float(12.3);
        Float f4=new Float("12.3");
        System.out.println(f1+" "+f2+" "+f3+" "+f4);//支持多种格式
        System.out.println(f4.getClass());
        test4();
    }

    public void test3(){//基本数据类型与包装类间的转化
        int num1=10;
        method(new Integer(num1));//多态体现,放不下基本数据类型就放类,类可以放包装类
        method(num1);//jdk5.0自动装箱与拆箱(默认就用这个,别纠结了)
    }

    public void test4(){//基本数据类型,包装类与String的转化
        int num1=10;
        String str1=num1+"";//自动类型转换,不再赘述
        //String.valueOf()转化,参数是包装类或者基本数据类型都可以
        String str2=String.valueOf(12.3f);
        String str3=String.valueOf(new Double(12.3f));
        System.out.println(str1+'\t'+str2+'\t'+str3+'\t');

        System.out.println(Integer.parseInt(str1)+" "+Float.parseFloat(str2));//别+'\t',会触发自动类型转换
    }




    protected void method(Object obj){

    }
}
