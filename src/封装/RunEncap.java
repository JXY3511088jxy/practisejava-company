package 封装;

public class RunEncap {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("张飞");
        encap.setAge(18);
        encap.setIdNum("12343ms");

        System.out.println(encap.getName()+"的年龄是"+encap.getAge()+"，"+"号码是："+encap.getIdNum());
    }
}
