class AriTest1{
	public static void main(String[] args){
		int a=2;
        int b=5;
        System.out.println(b/a);//直接除肯定是整除
        double res1=b/a;
        System.out.println(c);//答案是2.0，显然也不对

        double res2=b/(a+0.0);//+0.0变double
        double res3=(double)b/a;//强转
        System.out.println(res2);
        System.out.println(res3);
       // System.out.println(c);
	}

}