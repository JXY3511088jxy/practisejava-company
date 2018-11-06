package 异常处理;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 为了展示如何使用我们自定义的异常类，
 *
 * 在下面的 CheckingAccount 类中包含一个 withdraw() 方法抛出一个 InsufficientFundsException 异常。
 */
//此类模拟银行账户
public class CheckingAccount {
    //balance为余额，number为卡号
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number = number;
    }
    //方法：存钱
    public void deposit(double amount){
        balance+=amount;
    }
    //取钱
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount<=balance){
            balance-=amount;
        }else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    //方法：返回余额
    public double getBalance(){
        return balance;
    }
    //方法：返回卡号
    public int getNumber(){
        return number;
    }

}
