package java基础.接口与继承.接口;

import java基础.多线程.Hero;

public class APHero extends Hero implements AP {

    public APHero(){
        super();
    };

    public APHero(String name){
        super(name);
    }

    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

    public static void main(String[] args) {
        APHero ap = new APHero();
        ap.magicAttack();

        APHero ap1 = new APHero("zhangsan");
        System.out.println(ap1.name);
    }

}
