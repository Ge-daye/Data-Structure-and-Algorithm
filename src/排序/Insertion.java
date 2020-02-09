package 排序;
//插入排序实现
import java.util.Arrays;

public class Insertion {
    public static void sort(int a[]){
        int n = a.length;
        //外层循环是准备插入第几个元素，默认从第二个开始
        for (int i = 1; i <n ; i++) {
            //内层循环是将待插入元素与已排序的元素依次比较（倒序），如果更小就交换位置
            for (int j = i; j >0 ; j--) {
                if(a[j]<a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

            }

        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,3,2,10,12,1,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
