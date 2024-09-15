package classload_1;

import java.util.UUID;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:01
 * @Version 1.0
 */
public class Test7 {

    public static void main(String[] args) {
        System.out.println(Test7A.str);
    }
}
class Test7A{
    public static final String str = UUID.randomUUID().toString();

    static {
        //会执行初始化 因为uuid不是常量
        System.out.println("Test7_A static block");
    }
}
