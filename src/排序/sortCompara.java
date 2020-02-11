package 排序;

import java.util.Arrays;

//对于一个长度为10000且完全逆序的数组
//插入排序和希尔排序时间复杂度的比较，以运行时间为例
public class sortCompara {
    public static void main(String[] args) {
        Integer arr []  = new Integer[100000];
        for (int i = 0; i <100000 ; i++) {
            arr[i] =  100000-i;
        }
        System.out.println(arr[0]);

        //System.out.println(Arrays.toString(arr));


        shellSort(arr);
        //inserSort(arr);

    }
    public static void shellSort(Integer a[]){
        long begin = System.currentTimeMillis();
        Shell2.sort(a);//用希尔排序对数组排序
        long end = System.currentTimeMillis();
        System.out.println("希尔排序的时间为："+(end-begin));



    }
    public static void inserSort(int a[]){
        long begin = System.currentTimeMillis();
        Insertion.sort(a);//用插入排序对数组排序
        long end = System.currentTimeMillis();
        System.out.println("插入排序的时间为："+(end-begin));
    }


}
