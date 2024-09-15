package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:13
 * @Version 1.0
 */
public class Test9 {

    public static void main(String[] args) {
//        A static block
//        B static block
//        B str
        System.out.println(new Test9B().str);
    }
}

class Test9A {
    static {
        System.out.println("A static block");
    }
}

class Test9B extends Test9A{
    public String str = "B str";

    static {
        System.out.println("B static block");
    }
}
