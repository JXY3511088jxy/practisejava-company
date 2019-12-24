package java框架.spring.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {

    public void doSomeService(){
        System.out.println("doSomeService");
    }

    public void doSomeThing(String s){
        System.out.println(s);
    }
}
