package 异常处理;
/**
 * 如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。
 * 也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。
 */

import java.rmi.RemoteException;

public class ClassName {
    public void deposit(double amout) throws RemoteException{

        throw new RemoteException();
    }
}
