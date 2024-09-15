package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 21:50
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {
        System.out.println(Test1B.str);
    }
}
class Test1A{
    public static String str = "A str";

    static {
        System.out.println("A static block");
    }
}
//b被加载，但是不会被初始化
class Test1B extends Test1A{
    static {
        System.out.println("B static block");
    }
}
