package ch5.equals;

/**
 * @author 文进
 * @version 1.0
 */
public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandson", 75000, 1989, 12, 15);

        System.out.println("alice1 == alice2:" + (alice1 == alice2)); // true
        System.out.println("alice1 == alice3:" + (alice1 == alice3)); // false
        System.out.println("alice1.equals(alice3):" + (alice1.equals(alice3))); // true
        System.out.println("bob.equals(alice1):" + (bob.equals(alice1))); //false

        Manager carl = new Manager("Carl", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl", 80000, 1987, 12, 15);
        boss.setBonus(5000);
        System.out.println("boss.toString():" + boss);
        System.out.println("carl.equals(boss):" + carl.equals(boss)); // false
        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("carl.hashCode():" + carl.hashCode());
    }
}
