package java基础.多线程;

import java基础.接口与继承.重写.Item;

public class Hero {

    public String name;//姓名
    float hp;//血量
    float armor;//护甲
    public int MoveSpeed;//移动速度
    int damage;//伤害
    static String copyright;
    private String otherName;//外号，用于反射中调用私有方法。

    static {//静态方法块，会在类加载的时候执行，new对象的时候先于构造方法前执行。
        System.out.println("初始化 copyright");
        copyright = "版权由Riot Games公司所有";
    }

    public Hero(){//无参构造方法
        System.out.println("hero的无参构造方法");
    };

    public Hero(String name) {
        this.name = name;
    }//有参构造方法。用于初始化name

    Hero(String name,float hp,float armor,int MoveSpeed,int damage){
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.MoveSpeed = MoveSpeed;
        this.damage = damage;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
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
        return hp<=0?true:false;
    }

    public void useItem(Item i){        //对应到多态中增加的方法
        System.out.println("hero use Item");
        i.effect();
    }
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }

}
