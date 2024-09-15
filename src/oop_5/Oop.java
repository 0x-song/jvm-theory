package oop_5;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-25 16:38
 * @Version 1.0
 * 问题：一个数组中最大的元素个数是多少个？在对象头中，使用了4个字节来存储可以容纳的个数，也就是4^32 - 1
 * oop模型：在jvm中，使用Klass模型来存储类的对象信息；使用oop来存储对象信息
 *    MarkOopDesc：存放锁、分代年龄
 *    InstanceOopDesc：非数组对象
 *    arrayOopDesc：数组对象
 *          typeArrayOopDesc:基本数据类型数组
 *          objArrayOopDesc:引用类型数组
 */
public class Oop {

    public static void main(String[] args) {

    }
}
