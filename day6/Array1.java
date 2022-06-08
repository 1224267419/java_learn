public  class Array1{
    public static void main(String[] args) {
        System.out.println("hello");
        int[] ids;//声明
        ids =new int[]{1,2,4,5,6,7};//静态初始化

        String[] names =new String[5];//动态初始化
        System.out.println(ids[0]);//获取数组元素
        System.out.println(ids.length);//获取数组长度
        System.out.println(names[0]);
        
        for (int i=0;i<ids.length;i++){//遍历输出
            System.out.print(ids[i]);

        }
    }
}