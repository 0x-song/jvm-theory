package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 21:50
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {
//        A static block
//        B static block
//        B str
        System.out.println(Test3B.str);
    }
}
class Test3A{
    public static String str = "A str";

    static {
        System.out.println("A static block");
    }
}
class Test3B extends Test3A{
    public static String str = "B str";

    static {
        System.out.println("B static block");
    }
}
