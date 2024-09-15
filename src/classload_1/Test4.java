package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:01
 * @Version 1.0
 */
public class Test4 {

    public static void main(String[] args) {
        //并没有直接使用该类
        Test4A[] a = new Test4A[1];
        System.out.println("end");
    }
}
class Test4A{
    static {
        //不会输出
        System.out.println("Test4_A static block");
    }
}
