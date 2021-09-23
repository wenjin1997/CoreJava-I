- [第4章 对象与类](#第4章-对象与类)
  - [4.1 面向对象程序设计概述](#41-面向对象程序设计概述)
    - [4.1.1 类](#411-类)
    - [4.1.2 对象](#412-对象)
    - [4.1.3 识别类](#413-识别类)
    - [4.1.4 类之间的关系](#414-类之间的关系)
  - [4.2 使用预定义类](#42-使用预定义类)
    - [4.2.1 对象与对象变量](#421-对象与对象变量)
    - [4.2.2 Java类库中的LocalDate类](#422-java类库中的localdate类)
    - [4.2.3 更改器方法与访问器方法](#423-更改器方法与访问器方法)
  - [4.3 用户自定义类](#43-用户自定义类)
    - [4.3.1 Employee类](#431-employee类)
    - [4.3.2 多个源文件的使用](#432-多个源文件的使用)
    - [4.3.3 剖析Employee类](#433-剖析employee类)
    - [4.3.4 从构造器开始](#434-从构造器开始)
    - [4.3.5 用var声明局部变量](#435-用var声明局部变量)
    - [4.3.6 使用null引用](#436-使用null引用)
    - [4.3.7 隐式参数与显式参数](#437-隐式参数与显式参数)
    - [4.3.8 封装的优点](#438-封装的优点)
    - [4.3.9 基于类的访问权限](#439-基于类的访问权限)
    - [4.3.10 私有方法](#4310-私有方法)
    - [4.3.11 final实例字段](#4311-final实例字段)
  - [4.4 静态字段与静态方法](#44-静态字段与静态方法)
    - [4.4.1 静态字段](#441-静态字段)
    - [4.4.2 静态常量](#442-静态常量)
    - [4.4.3 静态方法](#443-静态方法)
    - [4.4.4 工厂方法](#444-工厂方法)
    - [4.4.5 main方法](#445-main方法)
    - [程序清单4-3 StaticTest/StaticTest.java](#程序清单4-3-staticteststatictestjava)
  - [4.5 方法参数](#45-方法参数)
    - [笔记](#笔记)
    - [程序清单](#程序清单)
  - [4.6 对象构造](#46-对象构造)
    - [4.6.1 重载](#461-重载)
    - [4.6.2 默认字段初始化](#462-默认字段初始化)
    - [4.6.3 无参数的构造器](#463-无参数的构造器)
    - [4.6.4 显式字段初始化](#464-显式字段初始化)
    - [4.6.5 参数名](#465-参数名)
    - [4.6.6 调用另一个构造器](#466-调用另一个构造器)
    - [4.6.7 初始化块](#467-初始化块)
    - [4.6.8 对象析构与finalize方法](#468-对象析构与finalize方法)
    - [程序清单](#程序清单-1)
  - [4.7 包](#47-包)
    - [4.7.1 包名](#471-包名)
    - [4.7.2 类的导入](#472-类的导入)
    - [4.7.3 静态导入](#473-静态导入)
    - [4.7.4 在包中增加类](#474-在包中增加类)
    - [程序清单](#程序清单-2)
      - [程序清单4-6 PackageTest/PackageTest.java](#程序清单4-6-packagetestpackagetestjava)
      - [程序清单4-7 PackageTest/com/horstmann/Employee.java](#程序清单4-7-packagetestcomhorstmannemployeejava)
    - [4.7.5 包访问](#475-包访问)
    - [4.7.6 类路径](#476-类路径)
    - [4.7.7 设置类路径](#477-设置类路径)
  - [4.8 JAR文件](#48-jar文件)
    - [4.8.1 创建JAR文件](#481-创建jar文件)
    - [4.8.2 清单文件](#482-清单文件)
    - [4.8.3 可执行JAR文件](#483-可执行jar文件)
    - [4.8.4 多版本JAR文件](#484-多版本jar文件)
    - [4.8.5 关于命令行选项的说明](#485-关于命令行选项的说明)
  - [4.9 文档注释](#49-文档注释)
    - [4.9.1 注释的插入](#491-注释的插入)
    - [4.9.2 类注释](#492-类注释)
    - [4.9.3 方法注释](#493-方法注释)
    - [4.9.4 字段注释](#494-字段注释)
    - [4.9.6 通用注释](#496-通用注释)
    - [4.9.7 注释抽取](#497-注释抽取)
  - [4.10 类设计技巧](#410-类设计技巧)

# 第4章 对象与类
## 4.1 面向对象程序设计概述
 
* 面向对象程序设计：object-oriented programming, OOP
* 面向对象的程序是由对象组成的，每个对象包含对用户公开的特定功能部分和隐藏的实现部分。
* OOP将数据放在第一位，然后再考虑操作数据的算法。
* 面向对象更加适合解决规模较大的问题。<!--more-->

### 4.1.1 类
* **类**是构造对象的模板和蓝图。
* 由类构造对象的过程称为创建类的**实例**。
* **封装**就是将数据和行为组合在一个包中，并对对象的使用者隐藏具体的实现方式。
* 对象中的数据称为**实例字段**，操作数据的过程称为**方法**。
* 作为一个类的实例，特定对象都有一组特定的实例字段值。这些值的集合就是这个对象的**当前状态**。
* 在Java中，所有类都源自一个“神通广大的超类”，就是Object。
* 通过扩展一个类来建立另外一个类的过程为**继承**。

### 4.1.2 对象
* 对象的三个主要特性：行为、状态、标识。
* 对象的行为是用可调用的方法来定义的。
* 每个对象都保存着描述当前状况的信息，这就是对象的**状态**。
* 对象状态的改变必须通过调用方法实现，否则破坏了封装性。
* 每个对象都有一个唯一的标识。
* 作为同一个类的实例，每个对象的标识总是不同的，状态也往往存在着差异。

### 4.1.3 识别类
* OOP学习中，首先从识别类开始，然后再为各个类添加方法。
* 经验：类——名词，方法——动词。

### 4.1.4 类之间的关系
* 在类之间，常见的关系：依赖、聚合、继承。
* 如果一个类的方法使用或操纵另一个类的对象，我们就说一个类**依赖**于另一个类。
* 应该尽可能地将相互依赖的类减至最少，减少类之间的耦合。
* **包容**关系意味着类A的对象包含类B的对象。

## 4.2 使用预定义类
### 4.2.1 对象与对象变量
* 要想使用对象，首先必须构造对象，并制定其初始状态。然后对对象应用方法。
* 构造器的名字应该与类名相同。
* 对象变量并没有实际包含一个对象，它只是**引用**一个对象。
* 在Java中，任何对象变量的值都是对存储在另外一个地方的某个对象的应用。new操作符的返回值也是一个引用。
* 可以显示地将对象变量设置为null，指示这个对象变量目前没有引用任何对象。

### 4.2.2 Java类库中的LocalDate类
* 用来表示时间点：Data类。
* 用大家熟悉的日历表示日期：LocalDate类。
* 不要使用构造器来构造LocalDate类的对象，实际上，应当使用静态工厂方法，它会代表你调用构造器。`LocalDate.now()`会构造一个新对象。
* LocalDate类封装了实例字段来维护所设置的日期。
### 4.2.3 更改器方法与访问器方法
* 只访问对象而不修改对象的方法有时称为**访问器方法**。

**CalendarTest.java**

```java
import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @version 1.5 2021-05-09
 * @author jinjin
 */

public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1); // set to start of month
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, . . . , 7 = Sunday

        System.out.println("Mon Tue Wed Thu Fir Sat Sun");
        for (int i = 1; i < value; i++)
            System.out.print("    ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() !=  1) System.out.println();
    }
}
```

## 4.3 用户自定义类
* 要想构建一个完整的程序，会结合使用多个类，其中只有一个类有main方法。

### 4.3.1 Employee类
程序清单 EmployeeTest.java

```java
/**
 * This program tests the Employee class
 * @version 1.13 2021-05-10
 * @author jinjin
 */

public class EmployeeTest {
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tony Tester", 40000,1990, 3, 15);

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + "," +
                    "hireDay=" + e.getHireDay());
    }
}
```
<!--more-->

程序清单 Employee.java

```java
import java.time.LocalDate;

class Employee {
    private final String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
```

* 源文件名是EmployeeTest.java，这是因为文件名必须与public类的名字相匹配。
* 在一个文件中，只能有一个公共类，但可以有任意数目的非公共类。

### 4.3.2 多个源文件的使用
* 可以将每一个类存放在一个单独的源文件中。
* 可以有两种编译源程序的方法。一种是使用通配符调用Java编译器：`javac Employee*.java`
* 第二种方法是：`javac EmployeeTest.java`

### 4.3.3 剖析Employee类
* 关键字public意味着任何类的任何方法都可以调用这些方法。
* 关键字private确保只有Employee类自身的方法能够访问这些实例字段，而其他类的方法不能够读写这些字段。
* 强烈建议将实例字段标记为private。
* 一种情况十分常见：类包含的实例字段通常属于某个类类型。

### 4.3.4 从构造器开始
```java
public Employee(String n, double s, int year, int month, int day)
    {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }
```
* 构造器与类同名。
* 在构造Employee类的对象时，构造器会运行，从而将实例字段初始化为所希望的初始状态。
* 构造器与其他方法有一个重要的不同。构造器总是结合new运算符来调用。不能对一个已经存在的对象调用构造器来达到重新设置实例字段的目的。
* 每个类可以有一个以上的构造器。
* 构造器可以有0个、1个或多个参数。
* 构造器没有返回值。
* 不要在构造器中定义域实例字段同名的局部变量。
* 必须注意在所有的方法中都不要使用与实例字段同名的变量。

### 4.3.5 用var声明局部变量
* 在Java10中，如果可以从变量的初始值推导出它们的类型，那么可以用var关键字声明局部变量，而无须指定类型。
* 注意var关键字只能用于方法中的局部变量。参数和字段的类型必须声明。

### 4.3.6 使用null引用
* 如果对null值应用一个方法，会产生一个NullPointerException异常。
* 定义一个类时，最好清楚知道哪些字段可能为null。
* 如果要接受一个对象引用作为构造参数，就要问问自己：是不是真的希望接受可有可无的值。如果不是，那么“严格型”方法更合适。

### 4.3.7 隐式参数与显式参数
* 在每一个方法中，关键字this指示隐式参数。

### 4.3.8 封装的优点
* 当想要获得或设置实例字段的值时，需要提供下面三项内容：
	* 一个私有的数据字段；
	* 一个公共的字段访问器方法；
	* 一个公共的字段更改器方法。
* 这么做的好处：
	* 可以改变内部实现；
	* 更改器方法可以完成错误检查，而只对字段赋值的代码可能没有这个麻烦。
* 注意不要编写返回可变对象引用的访问器方法。

### 4.3.9 基于类的访问权限
* 一个方法可以访问所属类的所有对象的私有数据。

### 4.3.10 私有方法
* 重点在于，只要方法是私有的，类的设计者就可以确信它不会在别处使用，所以可以将其删去。

### 4.3.11 final实例字段
* final修饰符对于类型为基本类型或者不可变类的字段尤其有用。

## 4.4 静态字段与静态方法
### 4.4.1 静态字段
* 如果将一个字段定义为`static`，每个类只有一个这样的字段。而对于非静态的实例字段，每个对象都有自己的一个副本。
* 即使没有`Employee`对象，静态字段`nextId`也存在。它属于类，而不属于任何单个的对象。
* 静态字段可以理解为**类字段**。<!--more-->

### 4.4.2 静态常量
```Java
public class Math
{
    ...
    public static final double PI = 3.14159265358979323846;
}
```
* 可以用`Math.PI`来访问这个常量。
* 如果省略关键字`static`，`PI`就变成了`Math`类的一个实例字段，需要通过`Math`类的一个对象来访问`PI`，并且每一个`Math`类对象都有它自己的一个`PI`副本。
* 一个常见的静态常量：`System.out`。

### 4.4.3 静态方法
* 静态方法是不在对象上执行的方法。
* 可以认为静态方法是没有`this`参数的方法。
* 静态方法可以访问静态字段。
* **建议使用类名而不是对象来调用静态方法。**
* 在下面两种情况**可以使用静态方法**：
    * 方法不需要访问对象状态，因为它需要的所有参数都通过显式参数提供（例如：`Math.pow`）。
    * 方法只需要访问类的静态字段（例如：`Employee.getNextId`）。

### 4.4.4 工厂方法
* **有待理解**

### 4.4.5 main方法
* `main`方法也是一个静态方法。
* `main`方法不对任何对象进行操作。静态的`main`方法将执行并构造程序所需要的对象。
* **每一个类可以有一个`main`方法**，这是常用于对类进行单元测试的一个技巧。

### 程序清单4-3 StaticTest/StaticTest.java
```java
/**
 * This program demonstrates static methods.
 * @version 1.02 2021-06-21
 * @author jinjin
 */
package ch4.StaticTest;

public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out information about all Employee objects
        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
            + e.getSalary());
        }

        int n = Employee.getNextId(); // calls static method
        System.out.println("Next available id=" + n);
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId; // return static field
    }

    public static void main(String[] args) { // unit test
        var e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }
}

```
* 可以用`Employee`类的静态`main`方法进行单元测试，运行`java Employee`。

## 4.5 方法参数
### 笔记
* **按值调用**（call by value）表示方法接收的是调用者提供的值。
* **按引用调用**（call by reference）表示方法接收的是调用者提供的变量地址。
* 方法可以修改按引用传递的变量的值，而不能修改按值传递的变量的值。
* Java程序设计语言**总是**采用按值调用。
* 有两种类型的方法参数：
  * 基本数据类型（数字、布尔值）。
  * 对象引用。<!--more-->
* 一个方法不可能修改基本数据类型的参数，而对象引用作为参数就不同了。
* 实现一个改变对象参数状态的方法是完全可以的。理由很简单，方法得到的是对象引用的副本，原来的对象引用和这个副本都引用同一个对象。
* Java程序设计语言对对象采用的不是引用调用，实际上，对象引用采用的是按值传递。
* **Java中对方法参数能做什么和不能做什么**：
  * 方法不能修改基本数据类型的参数（即数值型和布尔型）。
  * 方法可以改变对象参数的状态。
  * 方法不能让一个对象参数引用一个新的对象参数。

### 程序清单 
* 程序清单4-4 ParamTest/ParamTest.java
```java
package ch4.ParamTest;

/**
 * This program demonstrates parameter passing in Java
 * @version 1.01 2021-06-25
 * @author jinjin
 */

public class ParamTest {
    public static void main(String[] args) {
        /*
        * Test 1: Methods can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
        * Test 2: Methods can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary:");
        var harry = new Employee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
        * Test 3: Methods can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap:");
        var a = new Employee("Alice", 70000);
        var b = new Employee("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) // doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripSalary(Employee x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(Employee x, Employee y)
    {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee // simplified Employee class
{
    private String name;
    private double salary;

    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
```

## 4.6 对象构造
### 4.6.1 重载
* 如果多个方法有相同的名字、不同的参数，便出现了重载。
* 查找匹配的过程被称为重载解析。
* Java允许重载任何方法。
* 要完整地描述一个方法，需要指定方法名以及参数类型，这叫作方法的签名。
* 返回类型不是方法签名的一部分。也就是说，不能有两个名字相同、参数类型也相同却有不同返回类型的方法。<!--more-->

### 4.6.2 默认字段初始化
* 如果在构造器中没有显示地为字段设置初值，那么就会被自动地赋为默认值：数值为0、布尔值为false、对象引用为null。
* **字段与局部变量的一个重要区别**：方法中的局部变量必须明确地初始化，但是在类中，如果没有初始化类中的字段，将会自动初始化为默认值。

### 4.6.3 无参数的构造器
* 由无参数构造器创建对象时，对象的状态会设置为适当的默认值。
* 如果写一个类时没有编写构造器，就会为你提供一个无参数构造器。
* 如果类中提供了至少一个构造器，但是没有提供无参数的构造器，那么构造对象时如果提供参数就是不合法的。
* **仅**当类没有任何其他构造器的时候，你才会得到一个默认的无参数构造器。

### 4.6.4 显式字段初始化
* 不管怎样调用构造器，每个实例字段都要设置一个有意义的初值，确保这一点总是一个好主意。
* 初始值不一定是常量值。

### 4.6.5 参数名
* 有些程序员在每个参数前面加上一个前缀"a"。

```java
public Employee(String aName, double aSalary)
{
    name = aName;
    salary = aSalary;
}
```

* 另一种技巧：

```java
public Employee(String name, double salary)
{
    this.name = name;
    this.salary = salary;
}
```
### 4.6.6 调用另一个构造器
* 如果构造器的第一个语句形如`this(...)`，这个构造器将调用同一个类的另一个构造器。

### 4.6.7 初始化块
* 初始化数据字段的方法：
  * 在构造器中设置值；
  * 在声明中赋值；
  * 初始化块。

### 4.6.8 对象析构与finalize方法
* 由于Java会完成自动的垃圾回收，不需要人工回收内存，所以Java不支持析构器。

### 程序清单
ConstructorTest/ConstructorTest.java
```java
package ch4.ConstructorTest;

import java.util.Random;

/**
 * This program demonstrates object construction.
 * @version 1.02 2021-06-28
 * @author jinjin
 */

public class ConstructorTest {
    public static void main(String[] args)
    {
        // fill the staff array with three Employee objects
        var staff = new Employee[3];

        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + "" +
                    ",salary=" + e.getSalary());
    }
}

class Employee
{
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static
    {
        var generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public Employee(String n, double s)
    {
        name = n;
        salary = s;
    }

    public Employee(double s)
    {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // the default constructor
    public  Employee()
    {
        // name initialized to "" --see above
        // salary not explicitly set --initialized to 0
        // id initialized in initialization block
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }
}
```

## 4.7 包
### 4.7.1 包名
* 使用包的主要原因是确保类名的唯一性。
* 假如两个程序员不约而同地建立了Employee类。只要将这些类放置在不同的包中，就不会产生冲突。
* 每一个包都是独立的类集合。<!--more-->

### 4.7.2 类的导入
* 一个类可以使用所属包中的所有类，以及其他包中的**公共类**。
* 两种方式访问另一个包中的公共类：
  * 第一种方式是使用**完全限定名**，就是包名后面跟着类名。
`
java.time.LocalDate today = java.time.LocalDate.now();
`
  * 第二种方式是使用`import`语句导入一个特定的类或者整个包。`import`语句应该位于源文件的顶部（但位于`package`语句的后面）。
* 需要注意的是，只能使用星号（*）导入一个包。
* 在发生命名冲突的时候，就要注意包了。
* 确定要使用的是具体哪一个类时，可以增加一个特定的`import`语句。

```java
import java.util.*;
import java.sql.*;
import java.util.Date;
```
* 如果两个`Date`类都需要使用，则在每个类名的前面加上完整的包名。

```java
var deadline = new java.util.Date();
var today = new java.sql.Date(...);
```

### 4.7.3 静态导入
* 有一种`import`语句允许导入静态方法和静态字段，而不只是类。

```java
import static java.lang.System.*;
```
这样就可以使用`System`类的静态方法和静态字段，而不必加类名前缀：

```java
out.println("Goodbye, World!"); // i.e., System.out
exit(0); // i.e., System.exit
```
* 还可以导入特定的方法或字段

```java
import static java.lang.System.out;
```

* `import`加了`static`就很强大了，可以使用静态方法或字段。

### 4.7.4 在包中增加类
* 要想将类放入包中，就必须将包的名字放在源文件的开头，即放在定义这个包中各个类的代码之前。
* 如果没有在源文件中放置`package`语句，这个源文件中的类就属于**无名包**。
* 编译器处理文件（带有文件分隔符和扩展名.java的文件），而Java解释器加载**类**（带有.分隔符）。
* 如果包与目录不匹配，**虚拟机**就找不到类。

### 程序清单
#### 程序清单4-6 PackageTest/PackageTest.java
```java
import com.horstmann.corejava.*;
// the Employee class is defined in that package

import static java.lang.System.*;
/**
 * This program demonstrates the use of the packages.
 * @version 1.11 2021-06-29
 * @author jinjin
 */
public class PackageTest {
    public static void main(String[] args)
    {
        // because of the import statement, we don't have to use
        // com.horstmann.corejava.Employee here
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        // because of the static import statement, we don't have to use System.out here
        out.println("name=" + harry.getName() +",salary=" + harry.getSalary());
    }
}
```
#### 程序清单4-7 PackageTest/com/horstmann/Employee.java
```java
package com.horstmann.corejava;

// the classes in this file are part of this package

import java.time.LocalDate;

// import statements come after the package statement

/**
 * @version 1.11 2021-06-29
 * @author jinjin
 */

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
```
### 4.7.5 包访问
* 标记为`public`的部分可以由任意类使用；标记为`private`的部分只能由定义它们的类使用。
* 如果没有指定`public`或`private`，这个部分（类、方法或变量）可以被同一个包中的所有方法访问。
* 变量必须显式地标记为`private`，不然的话将默认为包可访问。显然，这样做会破坏封装性。

### 4.7.6 类路径
* 类的路径必须与包名匹配。
* 类文件也可以存储在JAR(Java归档)文件中。

### 4.7.7 设置类路径
* 最好使用`-classpath`（或`-cp`,或者Java9中的`--class-path`）选项指定类路径。

## 4.8 JAR文件
* 一个JAR文件既可以包含类文件，也可以包含诸如图像和声音等其他类型的文件。此外，JAR文件是压缩的，它使用了我们熟悉的ZIP压缩格式。

### 4.8.1 创建JAR文件
* 创建一个新JAR文件组常用的命令使用以下语法：

```java
jar cvf jarFileName file1 file2 ...
```
* 通常，jar命令的格式如下：<!--more-->

```java
jar options file1 file2 ...
```

### 4.8.2 清单文件
* 每个JAR文件包含一个*清单文件*，描述归档文件的特殊特性。
* 复杂清单文件可能包含更多条目。这些清单条目被分成多个节。第一节被称为主节。它作用于整个JAR文件。随后的条目用来指定命名实体的属性。 
* 要想要编辑清单文件，需要将希望添加到清单文件中的行放到文本文件中，然后运行：

```java
jar cfm jarFileName manifestFileName
```

### 4.8.3 可执行JAR文件
* 可以使用`jar`命令中的e选项指定程序的*入口点*，即通常需要在调用java程序启动器时指定类：
  
```java
jar cvfe Myprogram.jar com.mycompany.mypkg.MainAppClass files to add
```
* 或者，可以在清单文件中指定程序的*主类*，包括以下形式的语句：

```java
Main-Class: com.mycompany.mypkg.MainAppClass
```
### 4.8.4 多版本JAR文件
* Java9引入了*多版本JAR*，其中可以包含面向不同Java版本的类文件。
* 为了保证向后兼容，额外的类文件放在META-INF/versions目录中。
* 多版本JAR并不适用于不同版本的程序或库。
* 多版本JAR的唯一目的是支持你的某个特定版本的程序或库能够在多个不同的JDK版本上运行。

### 4.8.5 关于命令行选项的说明
* Java开发包（JDK）的命令行选项一直以来都使用单个短横线加多字母选项名的形式。

## 4.9 文档注释
* JDK包含一个很有用的工具，叫做javadoc，它可以由源文件生成一个HTML文档。

### 4.9.1 注释的插入
* javadoc实用工具从下面几项抽取信息：
  * 模块；
  * 包；
  * 公共类与接口；
  * 公共的和受保护的字段；
  * 公共的和受保护的构造器及方法。<!--more-->
* 每个/** ... */文档注释包含标记以及之后紧跟着的自由格式文本。标记以@开始，如@since或@param。
* 自由格式文本的第一句应该是一个*概要性*的句子。
* 在自由格式文本中，可以使用HTML修饰符。

### 4.9.2 类注释
* 类注释必须放在`import`语句之后，类定义之前。

### 4.9.3 方法注释
每一个方法注释必须在所描述的方法之前。

### 4.9.4 字段注释
* 只需要对公共字段（通常是静态常量）建立文档。

### 4.9.6 通用注释
* 标记@since text会建立一个“since”（始于）条目。*text*（文本）可以是引入这个特性的版本的任何描述。
* 通过@see和@link标记，可以使用超链接，连接到javadoc文档的相关部分或外部文档。
* 如果@see标记后面有一个<字符，就需要指定一个超链接。可以超链接到任何URL。
* 如果@see标机后面有一个双引号（"）字符，文本就会显示在"see also"部分。
* 可以为一个特性添加多个@see标记，但必须将它们放在一起。
* 要想产生*包注释*，就需要在每一个包目录中添加一个单独的文件。

### 4.9.7 注释抽取
略。

## 4.10 类设计技巧
1.**一定要保证数据私有。**
   * 这是最重要的；绝对不要破坏封装性。
   * 最好还是保持实例字段的私有性。<!--more-->
  
2.**一定要对数据进行初始化。**
   * 最好不要依赖于系统的默认值，而是应该显式地初始化所有数据，可以提供默认值，也可以在所有构造器中设置默认值。


3.**不要在类中使用过多的数据类型。**

4.**不是所有字段都需要单独的字段访问器和字段更改器。**

5.**分解过多职责的类。**

6.**类名和方法名要能够体现它们的职责。**
* 对此有一个很好的惯例：类名应当是一个名词，或者是前面有形容词修饰的名词，或者是动名词（有"-ing"后缀）修饰的名词。
* 对于方法来说，要遵循标准惯例：访问器方法用小写get开头（getSalary），更改器方法用小写set开头（setSalary）。
  
7.**优先使用不可变类。**
* 如果类是不可变的，就可以安全地在多个线程时间共享其对象。
* 要尽可能让类是不可变的。