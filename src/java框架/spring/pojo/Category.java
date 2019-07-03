package java框架.spring.pojo;

import org.springframework.stereotype.Component;

@Component("c")  //为Category 类加上@Component注解，即表明此类是bean
public class Category {

    private int id;

    private String name="Category的名字";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
