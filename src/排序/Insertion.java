package 排序;
//插入排序实现
import java.util.Arrays;

public class Insertion {
    public static void sort(int a[]){
        int n = a.length;
        for (int i = 1; i <n ; i++) {
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
