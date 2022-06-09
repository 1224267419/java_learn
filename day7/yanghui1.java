public class yanghui1{
    //要求输出10行的杨辉三角
    public static void main(String[] args) {
        int x[][] =new int [10][];//创建数组的行
        for(int i =0;i<x.length;i++){
            x[i]=new int[i+1];// 创建数组的列
            x[i][0]=x[i][i]=1;//首尾都是1

           // if(i>1){
            for(int j =1;j<x[i].length-1;j++){
                x[i][j]=x[i-1][j-1]+x[i-1][j];
                }
            //}
            
        }
        for (int i=0;i<x.length;i++){

            for (int j=0;j<x[i].length;j++){
                System.out.print(x[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}