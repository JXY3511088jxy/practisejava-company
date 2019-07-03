package java框架.spring.pojo;

import java框架.spring.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("p")   //为Product类加上@Component注解，即表明此类是bean
public class Product {

    private int id;

    private String name="Product的名字";

    //@Autowired
    private Category category;

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

    public Category getCategory() {
        return category;
    }

    @Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}
