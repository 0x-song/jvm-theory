package string_6;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-25 20:59
 * @Version 1.0
 * https://www.cnblogs.com/RDaneelOlivaw/p/13691002.html
 * String底层原理
 * 常量池包含class文件常量池、运行时常量池、字符串常量池
 * 运行时常量池：一般意义上指的常量池。是InstanceKlass的一个属性，存储于方法区
 * 字符串常量池：底层是StringTable，存储在堆区。继承关系：HashTable-StringTable-StringPool
 * HashTable如何存储字符串？HashTable底层使用的是数组+链表的形式。使用hash算法对字符串计算得到hash值，按照hash值将key和value放入hashtable中，如果有冲突则放入hashtable的链表中。
 * java字符串在jvm中的存储形式
 *  1.StringTable中的key生成方式：根据字符串和长度计算出hash值，根据hash值计算出index
 *  2.StringTable中的value生成方式：调用new_entry()方法将java的String类实例instanceOopDesc封装成HashTableEntry；instanceOopDesc：oop体系是java对象在jvm中的存在形式；相当于Klass是java类在jvm中的存在形式
 *
 */
public class StringTest {

    public static void main(String[] args) {
//        test1();
        System.out.println("=========");
        test2();
        System.out.println("=========");
        test3();
        System.out.println("=========");
        test4();
        System.out.println("=========");
        test5();
        System.out.println("=========");
        test6();
        System.out.println("=========");
        test7();
        System.out.println("=========");
        test8();
        System.out.println("=========");
        test9();
        System.out.println("=========");

    }

    private static void test9() {

    }

    private static void test8() {

    }

    private static void test7() {

    }

    //创建了几个对象？？？？
    //创建了几个String对象？？？2个
    //创建了几个oop对象？？？？？4个
    private static void test6() {
        String s1 = "111";
        String s2 = "222";
    }

    //生成了几个oop对象？？？4个
    private static void test5() {
        String s1 = new String("111");
        String s2 = new String("111");

    }

    //创建了几个对象？？？
    //常量池中没有找到
    //创建HashTableEntry指向String，String指向typeArrayOopDesc
    //因为new，所以堆上又创建了一个对象
    //生成了3个OOP对象；2个String对象
    private static void test4() {
        String s = new String("111");
    }

    //创建了几个对象？？？
    //创建了几个String对象？？？1个
    //创建了几个oop对象？？？2个，同上
    private static void test3() {
        String s1 = "1";
        String s2 = "1";

    }

    //该语句生成了几个oop对象？？
    //在字符串常量池中有没有找到该value，如果有则直接返回对应的String对象
    //如果没有找到，创建该value的typeArrayOopDesc，再创建String，String中包含char数组，char数组指向typeArrayOopDesc
    //在字符串常量池中创建HashTableEntry指向String（将String对象对应的instanceOopDesc封装成HashTableEntry作为StringTable的value值）
    //一共创建了几个对象？？？如果问创建多少个String对象？？？1个；如果问创建了几个OOP对象？？2个；一个typeArrayOop，一个String对象对应的InstanceOop
    private static void test2() {
        String s1 = "1";

    }

    /**
     * 两次hashcode的值相同；但是==不同；equals相同
     */
    private static void test1() {
        String s1="11";
        String s2=new String("11");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
