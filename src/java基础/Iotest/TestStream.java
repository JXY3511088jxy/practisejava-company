package java基础.Iotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {
    public static void main(String[] args) {
        try {
            File f = new File("D:/java基础.test.txt");
            FileInputStream fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(f);
            System.out.println(fis);

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
