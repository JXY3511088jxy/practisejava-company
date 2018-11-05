package 接口与继承.重写;

public class Item {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }

    public void effect(){
        System.out.println("物品使用以后，可以有效果");
    }
}
