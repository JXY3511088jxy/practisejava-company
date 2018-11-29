package java基础.enum枚举;

public class TestSeason1 {
    public static void main(String[] args) {
        for (Season s : Season.values()){
            System.out.println(s);
        }
    }
}
