package 异常处理;

/**
 * 下面的 BankDemo 程序示范了如何调用 CheckingAccount 类的 deposit() 和 withdraw() 方法。
 */
public class BankDemo {
    public static void main(String[] args) {

        CheckingAccount c = new CheckingAccount(101);
        System.out.println("depositing $500...");
        c.deposit(500);

        try {
            System.out.println("Withdrawing $100...");
            c.withdraw(100);
            System.out.println("Withdrawing $600...");
            c.withdraw(600);
        }catch (InsufficientFundsException e){
            System.out.println("sorry,but you are short $"+e.getAmount());
            e.printStackTrace();
        }


    }
}
