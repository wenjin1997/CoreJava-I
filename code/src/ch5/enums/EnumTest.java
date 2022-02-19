package ch5.enums;

import java.util.Objects;
import java.util.Scanner;

/**
 * @author 文进
 * @version 1.0
 * P197 枚举类
 */
public class EnumTest {
    public static void main(String[] args) {
//        Object in = new Scanner(System.in);
        String in = "extra_LARGE";
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }
}

// 枚举类Size
enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) { // 构造器
        this.abbreviation = abbreviation;
    }
    public String getAbbreviation() { // 方法
        return abbreviation;
    }

    private String abbreviation;
}
