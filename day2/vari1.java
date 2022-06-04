class VariableTest{
	public static void main(String[] args){
		String s1 = "hello world";
        boolean b1=true;
        int num=10;
        char c='a';
        String s2 = b1 + s1; //连接运算而不是简单的+
        //char c1="";//char不能空
        System.out.println(s1);
        System.out.println(s1+b1);
        System.out.println(s2);//只要有一个是String,那就肯定是连接

        System.out.println(c+num+s1);//第一次+是char和int的,触发自动类型转换,第二次有String,是连接           
        System.out.println(c+s1+num);//每一次+都有String，所以都是连接
        System.out.println(5-.314f);
	}

}