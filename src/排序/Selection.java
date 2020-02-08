package 排序;

import java.util.Arrays;

public class Selection {
    public static void sort(int []a){
        int n = a.length;
        int key;//记录每次排序最小的数
        int flag;//记录最小值的索引
        for (int i = 0; i < n-1; i++) {
            key = a[i];
            flag = i;
            for (int j = i+1; j < n; j++) {
                if(a[j]<key)
                {
                    key = a[j];//更新最小值
                    flag = j;
                }
            }
            a[flag] = a[i];//交换位置
            a[i] = key;

        }

    }

    public static void main(String[] args) {
        int []arr = new int[]{4,6,8,7,9,2,10,1};

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
