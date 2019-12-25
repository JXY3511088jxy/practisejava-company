package java基础.抽象类;

/**
 * 抽象类可以不包含抽象方法
 * 包含抽象方法的类一定是抽象类
 */
public abstract class Employee {

    private String name;

    private String address;

    private int number;
    //有参构造方法
    public Employee(String name,String address,int number){
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computePay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to"+this.name
        +" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+name;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getNumber(){
        return number;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setName(String name){this.name=name;}
    public void setNumber(int number){this.number=number;}

    //抽象方法必须有子类重写，否则子类也是抽象类
    public abstract void abs();

    //非抽象方法子类可以不重写就直接使用
    public void test(){
        System.out.println("这个是父类的非抽象方法，子类可以不重写，直接使用！");
    }
    //常量方法不能被子类重写
    public final void finaltest(){
        System.out.println("这是父类的常量方法，不能被子类重写！");
    }
    //私有方法也不能被子类重写
    private void siyou(){
        System.out.println("这是父类的私有方法，不能被子类重写！");
    }
}
