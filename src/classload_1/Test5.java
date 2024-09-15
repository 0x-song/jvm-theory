package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:01
 * @Version 1.0
 */
public class Test5 {

    public static void main(String[] args) {
        //并没有直接使用该类
        //Test5_A static block new直接使用
        Test5A a = new Test5A();
        System.out.println("end");
    }
}
class Test5A{
    static {
        //不会输出
        System.out.println("Test5_A static block");
    }
}
