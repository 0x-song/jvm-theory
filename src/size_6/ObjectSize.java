package size_6;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-27 22:12
 * @Version 1.0
 * 对象内存布局(以64位为例)
 *  mark word:8字节
 *  类型指针：开启指针压缩4字节，不开启8字节
 *  数组长度：有数组则4字节；没有0
 *  实例数据：boolean 1字节、byte 1字节、char 2字节、int 4字节、float 4字节、long 8字节、double 8字节；引用类型：开启指针压缩 4字节 未开启8字节
 *  对齐填充：所有对象的大小都必须能被8整除 8字节对齐
 *
 *  指针压缩的由来
 *  计算机操作系统分为32位和64位，32位操作系统的最大内存寻址空间是2^32 = 4GB,64位操作系统的寻址空间非常大
 *  32位操作系统的对象指针是4字节，64位操作系统的指针大小是8字节，导致了64位操作系统中对象的引用空间是32位的两倍
 *  间接导致了64位操作系统中更为频繁的内存消耗和更频繁的GC发生
 *  对象的引用变大了，可缓存的对象相对就少了，降低了CPU的命中率，所以最终便是在64位操作系统中依然利用32位对象指针来获取超过4G的内存寻址空间
 *  如何压缩指针？？？？？
 *  在JVM中，对象都是以8字节的方式进行对齐的，所以无论32位还是64位，末尾3位始终是0，那么既然末尾3位始终是0，无意义的0没必要存储
 *  相反，可以利用存储0的这三位存储一些有意义的值，这样便多出了3位的寻址空间，也就是继续使用32位来存储指针，只不过后3位用来存储0的被用来存储有意义的地址空间信息
 *  寻址的时候，将这32位的对象指针左移3位，原本32位的寻址空间变成了35位，可寻址空间位32G
 *  也就是在64位操作系统中，继续使用32位指针来存储，存储的时候右移3位，寻址的时候左移3位
 *  32GB瓶颈
 *
 *  调优的一些准则：
 *  单次GC控制在100ms以内
 *  5分钟一次YGC
 *  一天一次FGC
 */
public class ObjectSize {

    public static void main(String[] args) {

    }
}
