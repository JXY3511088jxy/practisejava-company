package 异常处理;

/**
 * 在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。
 * 所有异常都必须是 Throwable 的子类。
 * 如果希望写一个检查性异常类，则需要继承 Exception 类。
 * 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。
 */
public class InsufficientFundsException extends Exception {
    //此处的amount用来储存当出现异常（取出钱多余余额时）所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
}
