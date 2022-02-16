package ch5.abstractClasses;

/**
 * @author 文进
 * @version 1.0
 */
public class Student extends Person{
    private String major;

    /**
     * @param name 学生姓名
     * @param major 学生专业
     */
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
