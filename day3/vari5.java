class Sanyuan{
	public static void main(String[] args){
		int a=3,b=5;
        int max= (a>b) ? a :b;//声明的类型取决于表达式的类型，所以类型必须统一
        System.out.println(max);
        String maxStr= (a>b) ? "a大" : ( (a==b)? "a,b相等" : "b大");
        System.out.println(maxStr);
        
	}

}