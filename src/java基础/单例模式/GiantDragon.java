package java基础.单例模式;

/**
 * 饿汉式单例模式
 */

public class GiantDragon {

    //私有化构造方法使得该类无法在外部通过new进行实例化
    private GiantDragon(){

    }
    //准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();

    //public static 方法，提供给调用者获取10行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }
}
