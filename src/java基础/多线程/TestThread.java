package java基础.多线程;

public class TestThread {
    public static void main(String[] args) {
        Hero zhangfei = new Hero();
        zhangfei.name = "张飞";
        zhangfei.hp = 1000;
        zhangfei.damage = 50;

        Hero guanyu = new Hero();
        guanyu.name = "关羽";
        guanyu.hp = 1200;
        guanyu.damage = 60;

        Hero caocao = new Hero();
        caocao.name = "曹操";
        caocao.hp = 800;
        caocao.damage = 30;

        Hero liubei = new Hero();
        liubei.name = "刘备";
        liubei.hp = 900;
        liubei.damage = 40;

/*        //张飞攻击曹操
        while (!caocao.isDead()){
            zhangfei.attackHero(caocao);
        }

        //曹操攻击刘备
        while (!liubei.isDead()){
            caocao.attackHero(liubei);
        }
*/
        KillThread killThread1 = new KillThread(zhangfei,guanyu);//使用继承线程类方式
        killThread1.start();

        KillThread killThread2 = new KillThread(guanyu,caocao);
        killThread2.start();

/*        Battle battle1 = new Battle(liubei,caocao);//使用继承线程接口的方式
        new Thread(battle1).start();

        Battle battle2 = new Battle(caocao,zhangfei);
        new Thread(battle2).start();
*/
        Thread t1 = new Thread(){   //使用匿名类的方式创建线程
            public void run(){
                while (!liubei.isDead()){
                    caocao.attackHero(liubei);
                }
            }
        };



    }
}
