package java基础.异常处理;

/**
 * throw总是出现在函数体中，用来抛出一个Throwable类型的异常。程序会在throw语句后立即终止，它后面的语句执行不到，
 * 然后在包含它的所有try块中（可能在上层调用函数中）从里向外寻找含有与其匹配的catch子句的try块。
 * 要注意的是，throw 抛出的只能够是可抛出类Throwable 或者其子类的实例对象。
 * 如果抛出了检查异常，则还应该在方法头部声明方法可能抛出的异常类型。该方法的调用者也必须检查处理抛出的异常。
 * 如果所有方法都层层上抛获取的异常，最终JVM会进行处理，处理也很简单，就是打印异常消息和堆栈信息。
 * 如果抛出的是Error或RuntimeException，则该方法的调用者可选择处理该异常。
 */
public class TestException{

    static int quotient(int x, int y) throws MyException { // 定义方法抛出异常
        if (y < 0) { // 判断参数是否小于0
            throw new MyException("除数不能是负数"); // 异常信息
        }
        return x/y; // 返回值
    }
    public static void main(String args[]) { // 主方法
        int a =3;
        int b =0;
        try { // try语句包含可能发生异常的语句
            int result = quotient(a, b); // 调用方法quotient()
        } catch (MyException e) { // 处理自定义异常
            System.out.println(e.getMessage()); // 输出异常信息
        } catch (ArithmeticException e) { // 处理ArithmeticException异常
            System.out.println("除数不能为0"); // 输出提示信息
        } catch (Exception e) { // 处理其他异常
            System.out.println("程序发生了其他的异常"); // 输出提示信息
        }
    }
}

class MyException extends Exception { // 创建自定义异常类
    String message; // 定义String类型变量
    public MyException(String ErrorMessagr) { // 父类方法
        message = ErrorMessagr;
    }

    public String getMessage() { // 覆盖getMessage()方法
        return message;
    }
}

