class DoWhileText{
	public static void main(String[] args){
                int i=2;
                do{
                        if ((i&1) ==0){
                                System.out.println(i);
                        }
                        i++;
                }while(i<100);
                System.out.println(i);
	}

}