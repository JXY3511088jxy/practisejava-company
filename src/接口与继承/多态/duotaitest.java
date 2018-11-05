package 接口与继承.多态;

/**
 * 操作符的多态
 */
public class duotaitest {
    public static void main(String[] args) {
        int i = 5;
        int j = 6;
        int k = i+j;    //如果加号两侧都是整型，那么+代表数字相加

        System.out.println(k);

        int a= 5;
        String b="5";
        String c = a+b;     //如果+号两侧，任意一个是字符串，那么+代表字符串连接

        System.out.println(c);
    }
}
