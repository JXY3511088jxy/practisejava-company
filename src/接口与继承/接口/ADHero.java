package 接口与继承.接口;

/**
 * 与重写类似，方法的重写是子类覆盖父类的对象方法
 * 隐藏，就是子类覆盖父类的类方法
 */

import 多线程.Hero;
import 接口与继承.重写.Item;
import 接口与继承.重写.LifePotion;

public class ADHero extends Hero implements AD {

    int MoveSpeed = 400;

    public void physicAttack(){
        System.out.println("物理攻击");
    }

    public static void battleWin(){     //隐藏父类的battleWin方法
        System.out.println("ad hero battle win");
    }

    public ADHero(){
        System.out.println("ADhero的无参构造方法");
    }

    public ADHero(String name){
        super(name);
        System.out.println("ADHero的带参（name）构造方法");
    }

    public int getMoveSpeed(){
        return this.MoveSpeed;
    }

    public int getMoveSpeed2(){
        return super.MoveSpeed;
    }

    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
        System.out.println("---------------------------------------------------");

        new Hero();
        new ADHero();   //在调用子类的无参构造方法之前，会先去调用父类的无参构造方法。
        System.out.println("---------------------------------------------------");

        new ADHero("德莱文");
        System.out.println("---------------------------------------------------");

        ADHero h= new ADHero();
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
        System.out.println("---------------------------------------------------");

        LifePotion lp = new LifePotion();
        h.useItem(lp);
    }
}
