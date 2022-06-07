import java.util.Scanner;
import java.lang.Math;

class ScannerTest{
	public static void main(String[] args){
        
        Scanner scan= new Scanner(System.in);//实例化 Scanner类
        
        System.out.println("请输入两位数");
        int numi=scan.nextInt();
        int numi1=numi/10;
        int numi2=numi%10;
        
        double dou=Math.random();

        int num=(int)(dou*90+10);
        int num1=num/10;
        int num2=num%10;
        if (num==numi){
                System.out.println("拿10000");   
        }else if (num1==numi2 && num2==numi1){
                System.out.println("拿5000");  
        }else if (num1==numi1 | num2==numi2){
                System.out.println("拿1000");  
        }else if (num1==numi2 | num2==numi1){
                System.out.println("拿500");  
        }else{
                System.out.println("没中");
        }
	}
}