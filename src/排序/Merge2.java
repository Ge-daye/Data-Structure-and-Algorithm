package 排序;

import java.util.Arrays;

/**
 * @author 葛浩东
 * 归并排序 API 实现
 */

public class Merge2 {
    //成员变量。用于辅助的数组
    private  static Comparable [] assist;


    public static void main(String[] args){
        Integer arr[]={8,4,5,7,1,3,6,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

//对整个数组进行排序
    public static void sort(Comparable []a){
        //初始化辅助数组
        assist = new Comparable[a.length];
        //定义两个整数变量，lo表示较小的数量，hi表示较大的数量
        int lo = 0;
        int hi = a.length-1;
        //调用sort重载方法，对整个数组进行排序
        sort(a,lo,hi);

    }

//将数组a中，从索引lo到索引hi之间的元素进行排序
    private static void sort(Comparable []a,int lo,int hi){
        if(hi<=lo){//安全性校验,递归出口
            return;
        }
        //先将lo到hi的数据分为两个组
        int mid = lo+(hi-lo)/2;

        //再将两个组分别排序(递归调用)
        sort(a,lo,mid);
        sort(a,mid+1,hi);

        //再将两个组的元素合并为一个有序组
        merge(a,lo,mid,hi);


    }

// lo~mid 为一个小组，mid~hi 为一个小组，将这两个子组合并为一个有序的大组
    private static void merge(Comparable []a,int lo,int mid,int hi){
        /**
         * 说明：这里合并的两个数组，他们的各自是有序的
         */
        //定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;
        //遍历，移动指针p1 p2,比较两个索引处的值，将较小的填入assist数组
        while(p1<=mid && p2<=hi){
            if(less(a[p1],a[p2])){
                assist[i++] = a[p1++];
                /**
                 * 等价于：
                 * assist[i] = a[p1];
                 * i++;
                 * p1++;
                 */
            }
            else {
                assist[i++]  = a[p2++];
            }
            //本次循环结束后：i=mid+1;或者i=hi+1，所以

        }
        //如果p1没有走完，则顺序移动p1，把剩下的p1元素都依次填入assist中
        while (p1<=mid){
            assist[i++] = a[p1++];
        }

        //如果p2没有走完，则顺序移动p2，把剩下的p2元素都依次填入assist中
        while(p2<=hi){
            assist[i++]  = a[p2++];
        }

        //将辅助数组里的数复制到a[]数组中
        for (int j = lo; j <=hi ; j++) {
            a[j] = assist[j];
        }


    }

//判断x是否小于w
    private static boolean less(Comparable x,Comparable w){
        if(x.compareTo(w)<0){
            return true;
        }
        return false;
    }

//将数组a中序列为i和j的元素交换
    private static  void exch(Comparable a[],int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
