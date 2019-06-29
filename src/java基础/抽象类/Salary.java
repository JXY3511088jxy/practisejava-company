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
    public void setSalary(double salary){
        if (salary>=0.0){
            this.salary=salary;
        }
    }
    public double computePay(){
        System.out.println("Computing salary pay for"+getName());
        return salary/52;
    }
}
