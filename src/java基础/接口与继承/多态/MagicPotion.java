package java基础.接口与继承.多态;

/**
 * 观察类的多态现象：
 * 1. i1和i2都是Item类型
 * 2. 都调用effect方法
 * 3. 输出不同的结果
 */

import java基础.多线程.Hero;
import java基础.接口与继承.重写.Item;
import java基础.接口与继承.重写.LifePotion;

public class MagicPotion extends Item {

    public void effect(){
        System.out.println("蓝瓶时候后，可以回魔法");
    }

    public static void main(String[] args) {
        /*
        要实现类的多态，需要如下条件
        1. 父类（接口）引用指向子类对象
        2. 调用的方法有重写
         */
        Item i1 = new LifePotion();
        Item i2 = new MagicPotion();
        System.out.println("i1 是Item类型，执行effect打印：");
        i1.effect();
        System.out.println("i2 也是Item类型，执行effect打印：");
        i2.effect();
        System.out.println("-------------------------------------下面是第二种多态使用情况");
        //使用多态
        Hero garen = new Hero();
        garen.name = "盖伦";

        LifePotion lp = new LifePotion();
        MagicPotion mp = new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);
    }

}
