package 排序;

import java.util.Arrays;

//希尔排序算法实现
public class Shell {
    public static void main(String[] args) {
        int arr[] = new int[]{9,1,2,5,7,4,12,8,6,3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int a[]){
        int n = a.length;
        int h = a.length/2;
        //最外层循环为了控制 h最小为1
        while (h>=1){
            //第二层循环是排序的第几次趟数，从第h+1个元素开始排序，下标是h
            for (int i = h; i <n ; i++) {
                //第三层循环是具体每一趟排序的具体操作：从下标为 j=h 开始，与下标为 j-h的元素比较（因为是一组的）
                for (int j = i; j >=h ; j = j-h) {
                    if(a[j-h]>a[j]){
                        int temp = a[j];
                        a[j] = a[j-h];
                        a[j-h] = temp;
                    }

                }

            }
            h = h/2;//每次排完序，增长量h就对二取整
        }
    }
}
