package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:01
 * @Version 1.0
 */
public class Test8 {

    public static void main(String[] args) throws ClassNotFoundException {
//        Test8_A static block
//                end
        Class.forName("classload_1.Test8A");
        System.out.println("end");
    }
}
class Test8A{

    static {
        //会执行初始化 因为uuid不是常量
        System.out.println("Test8_A static block");
    }
}
