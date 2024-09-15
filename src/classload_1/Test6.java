package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:01
 * @Version 1.0
 */
public class Test6 {

    public static void main(String[] args) {
        System.out.println(Test6A.str);
    }
}
class Test6A{
    public static final String str = "A str";

    static {
        //不会输出 不会执行初始化代码
        System.out.println("Test6_A static block");
    }
}
