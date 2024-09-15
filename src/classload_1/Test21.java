package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:19
 * @Version 1.0
 */
public class Test21 {

    public static void main(String[] args) {
        Test21A instance = Test21A.getInstance();
        // 1 2
        System.out.println(instance.val1);
        System.out.println(instance.val2);
    }
}

class Test21A{

    //准备阶段，静态属性赋初值  初始化赋值  构造函数
    public static int val1 = 0;

    public static int val2 = 1;

    public static Test21A instance = new Test21A();

    Test21A(){
        val1 ++;
        val2 ++;
    }

    public static Test21A getInstance(){
        return instance;
    }
}
