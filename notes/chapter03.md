- [第3章 Java的基本程序设计结构](#第3章-java的基本程序设计结构)
  - [3.1 一个简单的Java应用程序](#31-一个简单的java应用程序)
  - [3.2 注释](#32-注释)
  - [3.3 数据类型](#33-数据类型)
    - [3.3.1 整型](#331-整型)
    - [3.3.2 浮点类型](#332-浮点类型)
    - [3.3.3 char类型](#333-char类型)
    - [3.3.4 Unicode和char类型](#334-unicode和char类型)
    - [3.3.5 boolean类型](#335-boolean类型)
  - [3.4 变量与常量](#34-变量与常量)
    - [3.4.1 声明变量](#341-声明变量)
    - [3.4.2 变量初始化](#342-变量初始化)
    - [3.4.3 常量](#343-常量)
    - [3.4.4 枚举类型](#344-枚举类型)
  - [3.5 运算符](#35-运算符)
    - [3.5.1 算术运算符](#351-算术运算符)
    - [3.5.2 数学函数与常量](#352-数学函数与常量)
    - [3.5.3 数值类型之间的转换](#353-数值类型之间的转换)
    - [3.5.4 强制类型转换](#354-强制类型转换)
    - [3.5.5 结合赋值和运算符](#355-结合赋值和运算符)
    - [3.5.6 自增与自减运算符](#356-自增与自减运算符)
    - [3.5.7 关系和boolean运算符](#357-关系和boolean运算符)
    - [3.5.8 位运算符](#358-位运算符)
    - [3.5.9 括号与运算符级别](#359-括号与运算符级别)
  - [3.6 字符串](#36-字符串)
    - [3.6.1 子串](#361-子串)
    - [3.6.2 拼接](#362-拼接)
    - [3.6.3 不可变字符串](#363-不可变字符串)
    - [3.6.4 检测字符串是否相等](#364-检测字符串是否相等)
    - [3.6.5 空串与Null串](#365-空串与null串)
    - [3.6.6 码点与代码单元](#366-码点与代码单元)
    - [3.6.9 构建字符串](#369-构建字符串)
  - [3.7 输入与输出](#37-输入与输出)
    - [3.7.1 读取输入](#371-读取输入)
      - [Scanner类的常用方法](#scanner类的常用方法)
      - [Consle类](#consle类)
      - [**代码**](#代码)
    - [3.7.2 格式化输出](#372-格式化输出)
    - [3.7.3 文件输入与输出](#373-文件输入与输出)
  - [3.8 控制流程](#38-控制流程)
    - [Remark](#remark)
    - [程序清单](#程序清单)
    - [Retirement.java](#retirementjava)
      - [Retirement2.java](#retirement2java)
      - [LotteryOdds.java](#lotteryoddsjava)
  - [3.9 大数](#39-大数)
    - [Remark](#remark-1)
    - [程序清单](#程序清单-1)
  - [3.10 数组](#310-数组)
    - [3.10.1 声明数组](#3101-声明数组)
    - [3.10.2 访问数组元素](#3102-访问数组元素)
    - [3.10.3 for each 循环](#3103-for-each-循环)
    - [3.10.4 数组拷贝](#3104-数组拷贝)
    - [3.10.5 命令行参数](#3105-命令行参数)
    - [3.10.6 数组排序](#3106-数组排序)
    - [3.10.7 多维数组](#3107-多维数组)
    - [3.10.8 不规则数组](#3108-不规则数组)

# 第3章 Java的基本程序设计结构
## 3.1 一个简单的Java应用程序

```java
public class FirstSample {
	public static void main(String[] args)
	{
		System.out.println("We will not use 'Hello, World!");
	}
}
```

* Java是区分大小写的。
* public为访问修饰符，用于控制程序的其他部分对这段代码的访问级别。
* 在Java中，应用程序中的全部内容都必须放置在类中。
* **类名的规则**：名字必须以字母开头，后面可以跟字母和数字的任意组合，长度没有限制，但是不能使用Java保留字。<!--more-->
* 类名的命名方法，可采用**骆驼命名法**，类名以大写字母开头，如果名字由多个单词组成，每个单词的第一个字母应该大写，如CameClass。
* Java虚拟机总是从指定类中的main方法的代码开始执行的。
* 根据Java语言规范，main方法必须声明为public。
* **每个Java应用程序都必须有一个main方法**，声明格式如下

```java
public class ClassName
{
	public static void main(String[] args)
	{
		program statements
	}
}
```

* 在Java中一对大括号表示方法体的开始与结束，每个句子必须使用分号结束。
* `System.out.print("Hello")`输出之后不增加换行符。

## 3.2 注释
Java中有三种注释方法：
* 使用//，注释内容从//开始到本行结尾。  
* 使用/*和\*/，这之间均为注释内容，可以注释更长的内容。
* 文档注释，以/**开始，以\*/结束。

```java
/**
 * This is the first sample program in Core Java CHapter 3
 * @version 1.01 1997-03-22
 * @author Gary Cornell 
 */
package firstsample;

public class FirstSample {
	public static void main(String[] args)
	{
		System.out.println("We will not use 'Hello, World!");
	}
}
```

## 3.3 数据类型
Java是一种强类型语言。在Java中，有8种基本数据类型，其中有4种整型、2种浮点类型、1种字符类型和1种用于表示真值的boolean类型。
### 3.3.1 整型
整型有4种类型。

|类型|存储需求|取值范围|
| ---- | ---- | ---- |
|int | 4字节|-2 147 483 648 ~ 2 147 483 647（刚刚超过20亿）|
|short | 2字节|-32 768 ~ 32 767|
|long|8字节|-9 223 372 036 854 775 808~9 223 372 036 854 775 807|
|byte|1字节|-128~127|

* byte和short类型主要用于特定的应用场合。
* 长整型数值有一个后缀L或l。例如如果直接运行`System.out.println(4000000000000);`会出现错误，提示`The literal 4000000000000 of type int is out of range`，这时要用到长整型数`System.out.println(4000000000000L);`。
* 十六进制数值有一个前缀0X或0x。
* 八进制有一个前缀0。
* 从Java7开始，加上前缀0b或0B可以写二进制。

### 3.3.2 浮点类型
Java中有两种浮点类型。

|类型|存储需求|取值范围|
|----|----|----|
|float|4字节|大约 $\pm$3.402 823 47E+38F(有效位数为6~7位)|
|double|8字节|大约 $\pm$1.797 693 134 862 315 70E+308(有效位数为15位)|

* 实际上，只有很少的情况适合使用float类型，例如，需要单精度数的库，或者需要大量存储数据时。
* float类型的数值有一个后缀F或f。没有后缀F的浮点数总是默认为double类型。
* 用于表示溢出和出错情况的三个特殊的浮点数值：正无穷大Double.POSITIVE\_INFINITY、负无穷大Double.NEGATIVE\_INFINITY、NaN（不是一个数字，常量表示为Double.NaN）。
* 检测一个特定值是否等于Double.NaN:`if(Double.isNaN(x)) // check whether x is "not a number"`。
* 特别注意：浮点数值不适用与无法接受舍入误差的金融计算，原因是浮点数值采用二进制系统表示，而在二进制系统中无法精确地表示分数1/10。

### 3.3.3 char类型
* char类型原本用于表示单个字符，如今，有些Unicode字符可以用一个或两个char值描述。
* char类型的字面量值要用单引号括起来，例如‘A’是编码值为65的字符常量。
* 转义序列\u还可以出现在加引号的字符常量和字符串之外（而其他所有的转义序列不可以）。
* Unicode转义序列会在解析代码之前得到处理，因此一定要当心注释中的\u。如`// \u000A is a newline`会报错。

### 3.3.4 Unicode和char类型
* 不同编码机制产生了两个问题：一是对于任意给定的代码值，在不同的编码方案下有可能对应不同的字母；而是采用大字符集的语言其编码长度有可能不同。
* 在Java中，char类型描述了UTF-16编码中的一个代码单元。
* 强烈建议不要在程序中使用char类型，除非确实需要处理UTF-16代码单元。最好将字符串作为抽象数据类型处理。

### 3.3.5 boolean类型
* boolean类型有两个值：false和true，用来判定逻辑条件。
* 整型值和布尔值之间不能进行转换。

## 3.4 变量与常量
### 3.4.1 声明变量
* 在Java中，每个变量都有一个类型。
* 声明变量的例子：

```java
double salary;
int vacationDays;
long earthPopulation;
boolean done;
```
* 变量名必须是一个以字母开头并由字母和数字构成的序列。
* 在Java中，“字母”和“数字”的范围更大。字母包括‘A’\~‘Z’、‘a’\~‘z’、‘_’、‘$’或在某种语言中表示字母的任何Unicode字符。数字包括‘0’\~‘9’和在某种语言中表示数字的任何Unicode字符。
* 变量中所有字符都是有意义的，并且大小写敏感。
* 如果想知道哪些Unicode字符属于Java中的“字母”，可以使用Character类的isJavaIdentifierStart和isJavaIdentifierPart方法来检查。
* 不能使用Java保留字作为变量名。
* 在Java9中，单下划线不能作为变量名。
* 逐一声明每一个变量可以提高程序的可读性。

### 3.4.2 变量初始化
* 声明一个变量之后，必须用赋值语句对变量进行显式初始化，千万不要使用未初始化的变量的值。
* 有两种方式进行变量初始化：

 ```java
 int vacationDays;
 vacationDays = 12;
 ```
 
 ```java
 int vacationDays = 12;
 ```
 
 * 在Java中可以将声明放在代码中的任何地方。
 * 在Java中，变量的声明尽可能地靠近变量第一次使用的地方，这是一种良好的程序编程风格。
 * 从Java10开始，对于局部变量，如果可以从变量的初始值推断出它的类型，就不再需要声明类型。只需要使用关键字var而无须指定类型。

 ```java
 var vacationDays = 12; // vacationDays is an int
 ```
 
 
### 3.4.3 常量
 
 * 关键字final表示这个变量只能被赋值一次。一旦赋值之后，就不能够再更改了。习惯上，常量名使用全大写。

 ```java
 public class Constants {
	public static void main(String[] args)
	{
		final double CM_PER_INCH = 2.54;
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
```

* 类常量，可以在一个类的多个方法中使用，使用关键字static final设置一个类常量。

```java
public class Constants2 {
	public static final double CM_PER_INCH = 2.54;
	
	public static void main(String[] args)
	{
		double paperWidth = 8.5;
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: "
				+ paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
	}
}
```

* 类常量的定义位于main方法的外部。如果一个类常量被声明为public，那么其他类的方法也可以使用这个常量。

### 3.4.4 枚举类型
* 枚举类型包括有限个命名的值。例如`enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};`。
* Size类型的变量只能存储这个类型声明中给定的某个枚举值，或者特殊值null，null表示这个变量没有设置任何值。

## 3.5 运算符
### 3.5.1 算术运算符
* 算术运算符+、-、*、/表示加、减、乘、除运算。
* 当参与/运算的两个操作数都是整数时，表示整数除法，否则，表示浮点除法。
* 整数的求余操作%。
* 整数被0除将会产生一个异常，而浮点数被0除将会得到无穷大或NaN结果。

### 3.5.2 数学函数与常量
* Math类中的sqrt方法并不处理任何对象，这样的方法被称为静态方法。
* pow方法有两个double类型的参数，其返回结果也为double类型。

```java
public class UseMath {
	public static void main(String[] args)
	{
		double x = 4;
		double y = Math.sqrt(x);
		double z = Math.pow(x, 2);
		System.out.println(y); // prints 2.0
		System.out.println(z); // prints 16.0
	}
}
```
<!--more-->
* 也可以在源文件的顶部加上`import  static java.lang.Math.*;`。

```java
import  static java.lang.Math.*;
public class UseMath {
	public static void main(String[] args)
	{
		double x = 4;
		double y = sqrt(x);
		double z = pow(x, 2);
		System.out.println(y); // prints 2.0
		System.out.println(z); // prints 16.0
	}
}
```

* floorMod方法的目的是解决一个长期存在的有关整数余数的问题。考虑表达式n%2，如果n为负且为奇数，这个表达式则为-1。实际上根据欧几里得规则，余数总是要$\ge0$。`floorMod(position + adjustment, 12)`总会得到一个0~11之间的数。（遗憾的是，对于负除数，floorMod会得到负数结果，不过这种情况在实际中很少出现。）
* 三角函数：

```java
Math.sin
Math.cos
Math.tan
Math.atan
Math.atan2
```
* 指数函数及它的反函数

```java
Math.exp
Math.log
Math.log10
```

* Java提供两个用于表示$\pi$和$e$常量的最接近的近似值：

```java
Math.PI
Math.E
```

### 3.5.3 数值类型之间的转换
* 当用一个二元运算符连接两个值时，先要将两个操作数转换为同一种类型，然后再进行计算。

### 3.5.4 强制类型转换
* 强制类型转换的语法格式是在圆括号中给出想要转换的目标类型，后面紧跟待转换的变量名。
* 强制类型转换是通过截断小数部分将浮点值转换为整型。
* 对浮点数进行舍入运算时，需要使用Math.round方法。当调用round的时候，仍然需要使用强制类型转换(int)。原因是round方法返回的结果为long类型，由于存在信息丢失的可能性，所以只有使用显式的强制类型转换才能够将long类型转换成int类型。

```java
double xx = 9.997;
int nxx = (int) xx;
System.out.println(nxx); // prints 9
int nxx2 = (int) Math.round(xx);
System.out.println(nxx2); // prints 10
```

* 如果试图将一个数值从一种类型强制转换为另一种类型，而又超出了目标类型的表示范围，结果就会截断成一个完全不同的值。如`(byte)300`的实际值为44。

### 3.5.5 结合赋值和运算符
* 可以在赋值中运用二元运算符，如`x += 4;`等价于`x = x + 4;`。
* 如果运算符得到一个值，其类型与左侧操作数的类型不同，就会发生强制类型转换。如果x是一个int，则`x += 3.5;`等价于`x = (int)(x + 3.5);`。

### 3.5.6 自增与自减运算符
* 自增运算符：n++，自减运算符：n--。
* 自增运算符还有一种“前缀”形式：++n。
* 后缀和前缀形式都会使变量值加1或减1。但用在表达式中时，二者就有区别了。前缀形式会先完成加1；而后缀形式会使用变量原来的值。
* 建议不要在表达式中使用++，因为这样的代码很容易让人困惑，而且会带来烦人的bug。

### 3.5.7 关系和boolean运算符
* &&和||运算符是按照“短路”方式来求值的。
* `x != 0 && 1 / x > x + y // no division by 0`，如果x等于0，那么第二部分就不会计算，除以0的错误就不会出现。
* Java支持三元操作符?:，例如`x < y ? x : y`返回x和y中较小的一个。

### 3.5.8 位运算符
* 如果n是一个整数变量，而且用二进制表示的n从右边数第4位为1，则`int fourthBitFromRight = (n & 0b1000) / 0b1000;`会返回1，否则返回0.
* 利用&并结合适当的2的幂，可以把其他位掩掉，而只留下其中的某一位。
* &和|运算符不采用“短路”方式求值。
* 需要建立位模式来完成掩码时，>>和<<运算符会很方便，`int fourthBitFromRight = (n & (1 << 3)) >> 3;`。
* \>>>运算符会用0填充高位，这与>>不同，它会用符号位填充高位。

### 3.5.9 括号与运算符级别
* 注意+=是右结合运算符。

## 3.6 字符串
* 从概念上讲，Java字符串就是Unicode字符序列。
* 每个双引号括起来的字符串都是String类的一个实例。

### 3.6.1 子串
* String类的substring方法可以从一个较大的字符串中提取出一个子串。

```java
public class SubString {
	public static void main(String[] args)
	{
		String greeting = "Hello";
		String s = greeting.substring(0, 3);
		System.out.println(s); // prints Hel
	}
}
```

* substring方法的第二个参数是不想复制的第一个位置。这样的工作方式有一个优点，容易计算子串的长度。字符串s.substring(a,b)的长度为b-a。

### 3.6.2 拼接
* Java语言允许使用+号连接两个字符串。
* 当一个字符串与一个非字符串的值进行拼接时，后者会转换成字符串。
* 如果需要把多个字符串放在一起，用一个界定符分隔，可以使用静态join方法。
* 在Java11中，提供了一个repeat方法。

```java
System.out.println(String.join("/", "S", "M", "L")); // prints S/M/L
System.out.println("Java".repeat(3)); // prints JavaJavaJava
```

### 3.6.3 不可变字符串
* 如何修改字符串？可以提取想要保留的子串，再与希望替换的字符拼接,`greeting = greeting.substring(0, 3) + "p!";`。
* 由于不能修改Java字符串中的单个字符，所以在Java文档中将String类对象称为是不可变的，但是，可以修改字符串变量。
* 不可变字符串有一个优点：编译器可以让字符串共享。

### 3.6.4 检测字符串是否相等
* `s.equals(t)`检测两个字符串是否相等，s与t可以是字符串变量，也可以是字符串字面量，例如`"Hello".equals(greeting)`。
* 检测两个字符串是否相等，而不区分大小写

```java
"Hello".equalsIgnoreCase("hello")
```
* 一定不要使用==运算检测两个字符串是否相等！这个运算符只能够确定两个字符串是否存放在同一个位置上。

### 3.6.5 空串与Null串
* 空串""是长度为0的字符串，有自己的串长度（0）和内容（空）。检查一个字符串是否为空：

```java
if(str.length() == 0)
```

```java
if(str.equals(""))
```

* null，表示目前没有任何对象与该变量关联。检查一个字符串是否为null：

```java
if(str == null)
```

* 检查一个字符串既不是null也不是空串，需要首先检查str不为null。

```java
if(str != null && str.length() != 0)
```
### 3.6.6 码点与代码单元
* 要想得到实际的长度，即码点数量，可以调用：

```java
int cpCount = greeting.codePointCount(0, greeting.length());
```
### 3.6.9 构建字符串
* 如果需要许多小段的字符串来构建一个字符串，按照下列步骤进行。

```java
StringBuilder builder = new StringBuilder();
builder.append(ch); // appends a single character
builder.append(str); // appends a string
String completedString = builder.toString();
```

## 3.7 输入与输出
### 3.7.1 读取输入
通过控制台进行输入的步骤：  
* 首先构造一个与“标准输入流”System.in关联的Scanner对象：  
`Scanner in = new Scanner();`  
* 使用Scanner类的各种方法读取输入：  
`String name = in.nextLine();`  
* Scanner类定义在java.util包中，使用时要用import导入。

#### Scanner类的常用方法  
* String nextLine():将读取一行输入 。   
* String next():读取输入的下一个单词（以空格作为分隔符）。  
* int nextInt() <!--more-->

#### Consle类
* Scanner类不适用于从控制台读取密码，此时可以用Consle类。

```java
Consle cons = System.console();
String username = cons.readLine("User name: ");
char[] passwd = cons.readPassword("Password: ");

```
#### **代码**

```java
import java.util.*;

/**
 * This program demonstrates console input
 * @version 1.10 2021-05-08 
 * @author 文进
 *
 */

public class InputTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// get first input
		System.out.print("What is your name? ");
		String name = in.nextLine();
		
		// get second input
		System.out.print("How old are you? ");
		int age = in.nextInt();
		
		// display output on console
		System.out.println("Hello, " + name + ".Next year, you'll be " + (age + 1));
		
	}

}

```

### 3.7.2 格式化输出
* `System.out.print(x);`将以x的类型所允许的最大非0数位个数打印输出x。
* `System.out.print("%8.2f", x);`字段宽度为8，包括8个字符，另外精度为小数点后2个字符，注意这里前导的空格也算一个字符。
* 每一个以%字符开始的格式说明符都用相应的参数替换。如：`System.out.printf("Hello, %s. Next year, you'll be %d.",name, age + 1);`,f表示浮点数，s表示字符串，d表示十进制整数。
* 还可以指定控制格式化输出外观的各种标志，如：`System.out.printf("%,.2f", 10000.0 / 3.0); //prints 3,333.33`
* 使用静态的String.format方法创建一个格式化的字符串，而不打印输出：`String message = String.format("Hello, %s. Next year, you'll be %d.", name, age + 1);`
* printf方法中有日期与时间格式化选项，如`System.out.printf("%tc", new Date()); // prints 周六 5月 08 20:44:49 CST 2021`

### 3.7.3 文件输入与输出
* 读取文件：`Scanner in = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF-8);`
* 写入文件：`PrintWriter out = new PrintWriter("myfile.txt", StandardCharsets.UTF_8);`

## 3.8 控制流程
### Remark
* 块确定了变量的作用域。
* 不能在嵌套的两个块中声明相同名的变量。
* for语句的第1部分通常是对计数器初始化；第2部分给出每次新一轮循环执行前要检测的循环条件；第3部分指定如何更新计数器。
* for语句的3各部分应该对同一个计数器变量进行初始化、检测和更新。
* 在循环中，检测两个浮点数是否相等需要格外小心，因为由于舍入误差，可能永远达不到精确的最终值。
* 如果在case分支语句的末尾没有break语句，哪门就会接着执行下一个case分支语句。这种情况相当危险，常常会引发错误。为此，我们在程序中从不使用switch语句。<!--more-->


### 程序清单
### Retirement.java

```java
import java.util.Scanner;

/**
 * This program demonstrates a <code>while</code> loop.
 * @version 1.20 2021-5-8
 * @author jinjin
 *
 */
public class Retirement {
	public static void main(String[] args) 
	{
		// read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retie? ");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		// update account balance while goal isn't reached
		while(balance < goal)
		{
			// add this year's payment and interest
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		
		System.out.println("You can retire in " + years + " years.");
	}

}

```
#### Retirement2.java

```java
import java.util.Scanner;

/**
 * This program demonstrates a <code>do/while</code> loop.
 * @version 1.20 2021-5-8
 * @author jinjin
 */

public class Retirement2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        //update account balance while user isn't ready to retire
        do {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // print current balance
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            //ask if ready to retire and get input
            System.out.print("Ready to retire?(Y/N) ");
            input = in.next();
        }
        while (input.equals("N"));
    }
}

```

#### LotteryOdds.java
```java
package ch3;

import java.util.Scanner;

/**
 * This program demonstrates a <code>for</code> loop.
 * @version 1.20 2021-05-09
 * @author jinjin
 */

public class LotteryOdds {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
        * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for(int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.printf("You odds are 1 in %,d. Good luck!", lotteryOdds);
    }
}
```

## 3.9 大数
### Remark
* BigInteger类实现任意精度的整数运算，BigDecimal实现任意精度的浮点数运算。
* 使用静态的valueOf方法可以将普通的数值转换为大数：`BigInteger a = BigInteger.valueOf(100);`
* 不能使用人们熟悉的算术运算符处理大数，而需要使用大数类中的add和multiply方法。


### 程序清单
BigIntegerTest.java 

```java
import java.math.BigInteger;
import java.util.Scanner;

/**
 * This program uses big numbers to compute the odds of winning the grand prize in a lottery.
 * @version 1.20 2021-05-09
 * @author jinjin
 */
public class BigIntegerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
        * compute binomial coefficient n*(n-1)*(n-2)*..*(n-k+1)/(1*2*3*...*k)
         */

        BigInteger lotteryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));

        System.out.printf("You odds are 1 in %,d. Good luck!", lotteryOdds);
    }
}
```
## 3.10 数组
### 3.10.1 声明数组
* 数组是一种数据结构，用来存储同一类型值得集合。
* 一旦创建了数组，就不能再改变它的长度。如果程序运行中需要经常扩展数组的大小，就应该使用另一种数据结构——数组列表（array list）。
* 创建数组对象并同时提供初始值的简写形式：`int[] smallPrimes = { 2, 3, 5, 7, 11, 13, };`
* 在Java中，允许有长度为0的数组。长度为0的数组与null并不相同。

### 3.10.2 访问数组元素
* 创建一个数字数组时，所有元素都初始化为0.
* boolean数组的元素初始化为false。
* 对象数组的元素初始化为一个特殊值null，表示这些元素（还）为存放任何对象。<!--more-->

### 3.10.3 for each 循环
* 依次处理数组中的每个元素，而不必考虑指定下标值：`for (variable : collection) statement`
* 更加简单的方式打印数组中的所有值：`System.out.println(Arrays.toString(a));`

### 3.10.4 数组拷贝
* 如果希望讲一个数组的所有值拷贝到一个新的数组中去，要使用Arrays类的copyOf方法：

```java
int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
```
第2个参数是新数组的长度，这个方法可以用来增加数组的大小。

### 3.10.5 命令行参数
* 在Java应用程序的main方法中，程序名并没有存储在args数组中。

### 3.10.6 数组排序
程序清单LotteryDrawing.java

```java
import java.util.Arrays;
import java.util.Scanner;

/**
 * This program demonstrates array manipulation.
 * @version 1.20 2021-05-09
 * @author jinjin
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        // fill an array with numbers 1 2 3 ... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        // draw k numbers and put them into a second array
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++)
        {
            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n);

            // pick the element at the random location
            result[i] = numbers[r];

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            n--;
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result)
            System.out.println(r);
    }
}
```

### 3.10.7 多维数组
程序清单CompoundInterest.java

```java
/**
 * This program shows how to store tabular data in a 2D array
 * @version 1.40 2021-05-09
 * @author jinjin
 */
public class CompoundInterest {
    public static void main(String[] args)
    {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEAS = 10;

        // set interest rate to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEAS][NRATES];

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        // compute interest for future years
        for (int i = 1; i < balances.length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%9.0f%%", 100 * interestRate[j]);

        System.out.println();

        // print balance table
        for (double[] row : balances)
        {
            // print table row
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();
        }
    }
}
```

### 3.10.8 不规则数组
* Java实际上没有多维数组，只有一维数组。多维数组被解释为“数组的数组”。

程序清单LotteryArray.java

```java
/**
 * This program demonstrates a triangular array.
 * @version 1.20 2021-05-09
 * @author jinjin
 */
public class LotteryArray {
    public static void main(String[] args)
    {
        final int NMAX = 10;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
```