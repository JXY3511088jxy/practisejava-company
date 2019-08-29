package java基础.Java对象初始化顺序;

/**
 * 不考虑静态成员的初始化，调用一个对象的构造函数时，程序先调用父类的构造函数（可以通过super关键字指定父类的构造函数，
 * 否则默认调用无参的构造函数，并且需要在子类的构造函数的第一行调用），
 * 之后静态成员变量的初始化函数和静态初始化块则按照在代码当中的顺序执行，成员变量如果没有指定值的话则赋予默认值，
 * 即基本数据类型为0或false等，对象则为null；最后调用自身构造函数。
 */
public class Derive extends Base{

    private Member m1 = new Member("Member 1");
    {
        System.out.println("Initial Block()");
    }

    public Derive() {
        System.out.println("Derive()");
    }

    private Member m2 = new Member("Member 2");
    private int i = getInt();

    private int getInt()
    {
        System.out.println("getInt()");
        return 2;
    }

    public static void main(String[] args)
    {
        new Derive();
    }
}

class Base
{
    public Base()
    {
        System.out.println("Base()");
    }
}

class Member
{
    public Member(String m)
    {
        System.out.println("Member() "+m);
    }
}
