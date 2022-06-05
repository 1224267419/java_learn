class AriTest4{
	public static void main(String[] args){
		int i=1;
		boolean b2=false;

		if (b2 && (i++>0)){
		System.out.println(i);
		}
		else{
			System.out.println(i);
		}

		if (b2 & (i++>0)){
			System.out.println(i);
			}
			else{
				System.out.println(i);
			}
	}

}