/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 21:27
 * @Version 1.0
 * Klass模型是什么？
 * 概括一句话便是java类在JVM中存在的形式
 * java类->C++类 klass
 * 非数组
 *  InstanceKlass 普通的类在JVM中对应的C++类(类的元信息) 方法区生成
 *  InstanceMirrorKlass 对应的便是Class对象  堆区生成
 *
 * 数组
 *  基本类型数组 boolean byte char short int float long double 对应
 *      TypeArrayKlass
 *  引用类型数组
 *      ObjArrayKlass
 *
 *  类加载过程：
 *  加载-----> 验证 -----> 准备 ------> 解析 ------> 初始化 ------> 使用 ------> 卸载
 *  加载：
 *      1.通过类的全限定类名获取该类的class文件
 *      2.解析成运行数据，即instanceKlass实例，存放在方法区
 *      3.在堆上生成类的Class对象，即instanceMirrorKlass实例
 *  初始化阶段：
 *      便是执行类的静态代码块 用jclasslib查看，看到clinit，没有该方法便不会有初始化
 *      1.如果没有静态变量、静态代码块，生成的字节码文件中便不会有clinit方法
 *      2.如果被final修饰，不会在clinit方法中体现
 *      3.一个字节码文件只有一个clinit方法
 *      4.clinit方法块中生成的代码顺序和java代码顺序一致。会影响程序的最终运行结果
 *      何时进行初始化？？？？？
 *          1.new、getstatic、putstatic、invokestatic
 *          2.反射
 *          3.初始化一个类的子类会去加载父类，并执行父类的初始化
 *          4.启动类
 */
public class KlassDemo {

    public static void main(String[] args) {

    }
}
