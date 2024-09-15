package classload_1;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:19
 * @Version 1.0
 */
public class Test22 {

    public static void main(String[] args) {
        Test22A instance = Test22A.getInstance();
        // 1 1
        System.out.println(instance.val1);
        System.out.println(instance.val2);
    }
}

class Test22A{

    //准备阶段，静态属性赋初值  初始化赋值  构造函数
    public static int val1;

    public static Test22A instance = new Test22A();

    public static int val2 = 1;

    Test22A(){
        val1 ++;
        val2 ++;
    }

    public static Test22A getInstance(){
        return instance;
    }
}
