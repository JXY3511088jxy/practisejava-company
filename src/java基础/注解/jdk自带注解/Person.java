package java基础.注解.jdk自带注解;

/**
 * 注解概念：Java提供了一种原程序中的元素关联任何信息和任何元数据的途径和方法。
 * @Override 表示覆盖或重写父类的方法；
 *
 * @Deprecated 表示该方法已经过时了。（当方法或是类上面有@Deprecated注解时，说明该方法或是类都已经过期不能再用，
 * 但不影响以前项目使用，提醒你新替代待的方法或是类。如果程序员不小心使用了它的元素,那么编译器会发出警告信息。）
 *
 * @SuppressWarnings 表示忽略指定警告，比如@Suppvisewarnings("Deprecation")
 *
 */
public interface Person {

    public String name();

    public int age();

    /*@Deprecated 表示该方法已经过时了*/
    @Deprecated
    public void sing();
      /*注：
      当方法或是类上面有@Deprecated注解时，
      说明该方法或是类都已经过期不能再用，
      但不影响以前项目使用，提醒你新替代待的方法或是类
      */
}
