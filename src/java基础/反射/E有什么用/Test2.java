package java基础.反射.E有什么用;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 首先准备两个业务类，这两个业务类很简单，就是各自都有一个业务方法，分别打印不同的字符串
 *
 * 当需要从第一个业务方法切换到第二个业务方法的时候，使用非反射方式，必须修改代码，并且重新编译运行，才可以达到效果
 *
 * 使用反射方式，首先准备一个配置文件，就叫做spring.txt吧, 放在src目录下。 里面存放的是类的名称，和要调用的方法名。
 * 在测试类Test中，首先取出类名称和方法名，然后通过反射去调用这个方法。
 *
 * 当需要从调用第一个业务方法，切换到调用第二个业务方法的时候，不需要修改一行代码，也不需要重新编译，只需要修改配置文件spring.txt，再运行即可。
 *
 * 这也是Spring框架的最基本的原理，只是它做的更丰富，安全，健壮。
 */
public class Test2 {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args)  {//运行报错的原因是文件中的包路径包含了中文。

        //从spring.txt中获取类名称和方法
        File springConfigFile = new File("D:\\IdeaProjects\\practice\\lib\\123.txt");
        Properties springConfig = new Properties();
        try {
            springConfig.load(new FileInputStream(springConfigFile));
            String className = (String)springConfig.get("class");//这种方式读取的文件中是不能有中文的，不然读不出来。
            System.out.println(className);
            String methodName = (String)springConfig.get("method");


            //根据类名称获取类对象
            Class clazz = Class.forName(className);
            //根据方法名称，获取方法对象
            Method m = clazz.getMethod(methodName);
            //获取构造器
            Constructor c = clazz.getConstructor();
            //根据构造器，实例化出对象
            Object service = c.newInstance();
            //调用对象的制定方法
            m.invoke(service);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
