package 多线程;

public class Hero {
    public String name;
    float hp;
    float armor;
    int movespeed;
    int damage;
    Hero(){};//无参构造方法
    public Hero(String name){
        this.name = name;
    }//有参构造方法。用于初始化name
    Hero(String name,float hp,float armor,int movespeed,int damage){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.movespeed = movespeed;
        this.damage = damage;
    }
    void keng(){
        System.out.println("这个一个坑货");
    }//未加权限修饰符的方法默认为包权限
    public void attackHero(Hero h){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }
    public boolean isDead() {
        return 0>=hp?true:false;
    }
}
