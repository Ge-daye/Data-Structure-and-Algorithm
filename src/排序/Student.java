package 排序;
/*
通过Comparable接口设置学生类对象排序规则
 */
public class Student implements Comparable<Student>{
    private String username;
    private  int age;



    public Student(String name,int age){
        this.username = name;
        this.age = age;

    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
//说明：CompareTo是Compareble接口中的唯一抽象方法（自然比较方法）
    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}
