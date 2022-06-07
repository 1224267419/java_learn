class WhileWhileText{
	public static void main(String[] args){
                int i=1;
                int j=1;
                long start=System.currentTimeMillis();
                while(i<10){
                        j=i;
                        while (j<10){
                                System.out.print(i+"*" +j + "=" + i*j +'\t');
                                j++;
                        }
                        System.out.print('\n');
                        i++;
                }
                long end=System.currentTimeMillis();
                System.out.println(end-start);
                
	}

}