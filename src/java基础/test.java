package java基础;

public class test {
    public static void main(String[] args) {
        human h = new man();
        ((man) h).hunt();
        h.eat();
        int n;
        n = ((man) h).getint(2);
        System.out.println(n);
    }
}
