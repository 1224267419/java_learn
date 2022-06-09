class Array2{
    public static void main(String[] args) {
        int[][] arr =new int[4][3];//动态初始化二维数组
        int[][] arr0 =new int[4][];//这个也是合理的
        //int[][] arrn =new int[4][];//这个是不合理的
        int[][] arr1 =new int[][]{{1,2},{2,3,4,5},{7,8,9}};//静态初始化二维数组
        int[] arr2[] =new int[][]{{1,2},{2,3,4,5},{7,8,9}};//这样初始化也可以
        int[] arr3[] ={{1,2},{2,3,4,5},{7,8,9}};//也可以像一维数组一样省静态的前半部分

    }
}