import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);//实例化 Scanner类
        

        int numi=scan.nextInt();
        System.out.println(numi);

        float numf=scan.nextFloat();//调用scan的相关方法实现功能
        System.out.println(numf);
        
        String string = scan.next();//非基本数据类型
        System.out.println(string);
	}

}