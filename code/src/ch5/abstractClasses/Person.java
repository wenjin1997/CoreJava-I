package ch5.abstractClasses;

/**
 * @author 文进
 * @version 1.0
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
