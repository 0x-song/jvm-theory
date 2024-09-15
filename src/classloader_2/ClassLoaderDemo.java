package classloader_2;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-21 22:36
 * @Version 1.0
 * 类加载过程：
 *   加载-----> 验证 -----> 准备 ------> 解析 ------> 初始化 ------> 使用 ------> 卸载
 *
 *  解析阶段，一般会和初始化阶段搭配紧密配合
 *  间接引用(静态常量池的索引) ----> 直接引用(内存地址)
 *  发生时机： 类加载以后马上解析、使用的时候
 *  解析什么： 继承的类、接口；属性；方法
 *  如何避免重复解析：借助缓存 ConstantPoolCache
 */
public class ClassLoaderDemo {
}
