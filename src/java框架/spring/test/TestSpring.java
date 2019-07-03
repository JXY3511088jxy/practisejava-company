package java框架.spring.test;
/**
 * 以获取对象的方式来进行比较
 *
 * 传统的方式：
 * 通过new 关键字主动创建一个对象
 * IOC方式
 * 对象的生命周期由Spring来管理，直接从Spring那里去获取一个对象。 IOC是反转控制 (Inversion Of Control)的缩写，
 * 就像控制权从本来在自己手里，交给了Spring。
 *
 * 打个比喻：
 * 传统方式：相当于你自己去菜市场new 了一只鸡，不过是生鸡，要自己拔毛，去内脏，再上花椒，酱油，烤制，经过各种工序之后，才可以食用。
 * 用 IOC：相当于去馆子(Spring)点了一只鸡，交到你手上的时候，已经五味俱全，你就只管吃就行了。
 *
 */

import java框架.spring.pojo.Product;
import java框架.spring.service.ProductService;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );

        Product p = (Product)context.getBean("p");

        //Category c = (Category)context.getBean("c");

        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());

        ProductService s =(ProductService)context.getBean("s");
        s.doSomeService();
    }
}
