package 排序;

public class TestCompareble {
    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);
        if(result>=0)
        {
            return c1;
        }
        else
            return c2;
    }
    public static void main(String[] args) {

        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);
        Comparable max = getMax(s1,s2);
        System.out.println(max);

    }
}
