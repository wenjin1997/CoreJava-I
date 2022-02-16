package ch5.abstractClasses;

/**
 * @author 文进
 * @version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // 打印，这里用到动态绑定
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

    }
}
