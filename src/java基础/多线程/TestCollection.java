package java基础.多线程;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {

//        Hero heros[] = new Hero[10];
//
//        heros[0] = new Hero("张飞");
//
//        heros[20] = new Hero("关羽");

//        ArrayList heros1 = new ArrayList();
//
//        heros1.add(new Hero("刘备"));

        List heros = new ArrayList();
        heros.add(new Hero("曹操"));
        heros.add(new Hero("张辽"));
        System.out.print(heros.size());

    }
}
