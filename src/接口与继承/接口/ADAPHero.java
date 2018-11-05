package 接口与继承.接口;

import 多线程.Hero;

public class ADAPHero extends Hero implements AD,AP {

    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
}
