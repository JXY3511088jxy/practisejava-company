package 封装;

/**
 * 封装的优点
 * 1. 良好的封装能够减少耦合。
 *
 * 2. 类内部的结构可以自由修改。
 *
 * 3. 可以对成员变量进行更精确的控制。
 *
 * 4. 隐藏信息，实现细节。
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
