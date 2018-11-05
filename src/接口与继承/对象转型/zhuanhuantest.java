package 接口与继承.对象转型;

/**
 *
 */

import 多线程.Hero;
import 接口与继承.接口.AD;
import 接口与继承.接口.ADAPHero;
import 接口与继承.接口.ADHero;
import 接口与继承.接口.APHero;

public class zhuanhuantest {
    public static void main(String[] args) {
        //实例化对象
        Hero h = new Hero();
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        /*
        所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
        类型转换有时候会成功，有时候会失败(参考基本类型的类型转换)
        到底能否转换成功？ 教大家一个很简单的判别办法
        把右边的当做左边来用，看说得通不
         */
        //向上转型
        h = ad;
        h = ap;

        //向下转型
        ad = (ADHero)h;    //强制转换,h指向了ADHero对象，将h转换为ADHero是没有问题的，如果指向的其他就报错
        ap = (APHero)h;

        //没有继承关系的两个类，互相转换，一定会失败
//        ad = (ADHero) ap;

        /*
        接口向上向下转型
         */
        AD adi = ad;    //向上转型

        ADHero adHero = (ADHero) adi;    //向下转型

        ADAPHero adapHero = (ADAPHero) adi;    //向下转型
        adapHero.magicAttack();

        /*
        instanceof Hero 判断一个引用所指向的对象，是否是Hero类型，或者Hero的子类
         */

        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h instanceof ADHero);

        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h instanceof APHero);

        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h instanceof Hero);
    }
}
