class LabelBreak{
	public static void main(String[] args){
                int i=1;
                int j=1;
                
                label :while(i<10){
                        j=i;
                        while (j<10){
                                System.out.print(i+"*" +j + "=" + i*j +'\t');
                                j++;
                                continue label;
                        }
                        System.out.print('\n');
                        i++;
                }
                long end=System.currentTimeMillis();
                
                
	}

}