class AriTest{
	public static void main(String[] args){
		int a=2;
        int b=a++;//先取值，后运算
        int c=++a;//先运算，后取值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        b=a--;
        c=--a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
	}

}