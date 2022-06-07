class WhileText{
	public static void main(String[] args){
                int i=2;
                while(i<100){
                        if ((i&1) ==0){
                                System.out.println(i);
                        }
                        i++;
                }
                System.out.println(i);
	}

}