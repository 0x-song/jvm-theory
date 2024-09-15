package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:13
 * @Version 1.0
 */
public class Test10 {

    public static void main(String[] args) {
//        A static block
//        A str
        System.out.println(Test10B.str);
    }
}

class Test10A {

    public static String str = "A str";

    static {
        System.out.println("A static block");
    }
}

class Test10B extends Test10A{
    static {
        str += "111";
        System.out.println("B static block");
    }
}
