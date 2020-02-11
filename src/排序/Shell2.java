package 排序;

import java.util.Arrays;
//希尔排序，API设计
public class Shell2 {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{9,1,2,5,7,4,12,8,6,3,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    //希尔排序的函数体
    public static  void sort(Comparable a[]){
        int n = a.length;
        int h = a.length/2;

        /*while(h<a.length/2){
            h = 2*h+1;

        }
        */
        while(h>=1){
            for (int i = h; i < n; i++) {
                for (int j = i; j >=h; j = j-h) {
                    if(great(a[j-h],a[j]))
                    {
                        exch(a,j-h,j);
                    }
                }
            }
            h = h/2;
        }


    }
    //判断x是否大于v
    public static boolean great(Comparable x,Comparable v){
        if(x.compareTo(v)>0)
        {
            return true;
        }
        return false;
    }
    //交换Comparable实现类对象数组的第 i和j元素
    public static void exch(Comparable a[],int i,int j){
        Comparable temp  = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
