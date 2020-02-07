package 排序;
/*
冒泡排序算法,对整数进行排序
 */
public class Bubble {
    public static void sort(int []a){
        int n = a.length;
        int temp;
        //外层循环是冒泡的次数
        for (int i = 0; i <n-1 ;i++) {
            //内层循环是相邻元素的大小比较,将较大的数放在后面
            for(int j = 0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }

    }

    public static void show(int a[]){
        for (int i = 0; i <a.length ; i++) {

            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,3,2,1};
        sort(arr);
        show(arr);
    }
}
