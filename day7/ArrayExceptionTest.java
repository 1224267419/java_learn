import java.util.Arrays;

public class ArrayExceptionTest{
    public static void main(String[] args) {
        int[] arr=new int[] {1,2,3,4,5};
        //System.out.println(arr[5]);//越界异常ArrayIndexOutOfBoundsExcetion
        //System.out.println(arr[-2]);//也是越界异常

        //空指针异常NullPointerException
        int [] arr1=new int[10];
        System.out.println(arr1);//输出指针
        System.out.println(arr1[0]);//输出默认值
        arr1=null;//指向空指针
        System.out.println(arr1);//输出null
        //System.out.println(arr1[0]);//报错

        int [] arr2=new int[10][];
        System.out.println(arr2);//输出null
        //System.out.println(arr2[0]);//报错
        //System.out.println(arr2[0][0]);//这个就更加不可能实现了

        arr[0]=null;
        //System.out.println(Arrays.toString(arr[0]));//

    }
}