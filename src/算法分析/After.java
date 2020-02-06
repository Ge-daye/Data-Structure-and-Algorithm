package 算法分析;

public class After {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println(begin);
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            sum +=i;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end);
    }
}
