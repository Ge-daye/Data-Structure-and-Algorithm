package 排序;

import java.util.Arrays;

public class Bubble2 {
    public static void main(String[] args) {
        Integer []arr = new Integer[]{5,3,4,1,6,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(Comparable []a){
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(great(a[j],a[j+1]))
                {
                    exch(a,j,j+1);
                }
            }

        }

    }
    public static void exch(Comparable []a,int i,int j){
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static boolean great(Comparable c1,Comparable c2){
        if(c1.compareTo(c2)>0)
        {
            return true;
        }
        return false;
    }

}
