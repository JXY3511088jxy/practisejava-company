package 单例模式;

/**
 * 懒汉式单例模式
 */
public class GiantDragon1 {

    //私有化构造方法使得该类无法在外部通过new进行实例化
    private GiantDragon1(){

    }
    //准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
    private static GiantDragon1 instance1;

    //public static 方法，提供给调用者获取10行定义的对象
    public static GiantDragon1 getInstance(){

        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if(null==instance1){
            instance1 = new GiantDragon1();
        }
        //返回 instance指向的对象
        return instance1;
    }
}
