package proxy_pattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image proxy = new ProxyImage("Hello_World!");
        proxy.display();
    }
}
