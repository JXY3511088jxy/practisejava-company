package java基础.抽象类;

/**
 * 抽象类可以不包含抽象方法
 * 包含抽象方法的类一定是抽象类
 */
public abstract class Employee {

    private String name;

    private String address;

    private int number;

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
}
