package java基础.抽象类;

public class Salary extends Employee{

    private double salary;//Annual salary
    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("within mailCheck of Salary class ");
        System.out.println("Mailing check to"+getName()
        +"with salary"+salary);
    }

    @Override
    public void abs() {
        System.out.println("这是父类的抽象方法，子类必须重写，否则子类也是抽象类！");
    }

    public void setSalary(double salary){
        if (salary>=0.0){
            this.salary=salary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for"+getName());
        return salary/52;
    }

    public void son(){
        System.out.println("这个是子类特有的方法！");
        siyou1();
    }

    private void siyou1(){
        System.out.println("这是子类与父类私有方法同名的方法！");
    }

}
