import java.util.Arrays;
public class Arrays_lei{
    public static void main(String[] args) {
        int [] a1={1,2,3,4,3,2,1};
        int a2[] ={1,2,3,4,3,2,1};
        int a3[] ={1,2,3,5,100000,9,8,7,6,2,2,2};

        System.out.println(Arrays.equals(a1, a2));//equals比对两个数组是否完全相同
        System.out.println(Arrays.equals(a3, a2));
        
        System.out.println(Arrays.toString(a3));//用字符串的方式输出数组
        Arrays.sort(a3);//排序（无输出值的）
        System.out.println(Arrays.toString(a3));
        if (Arrays.binarySearch(a3, 90)>=0){
        System.out.println(Arrays.binarySearch(a3, 90));//二分查找（只能找排序以后的）,注意，输出类型为int
    }
        else{
            System.out.println("没找到");
        }
    }

}