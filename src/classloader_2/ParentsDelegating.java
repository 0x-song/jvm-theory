package classloader_2;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-08-22 20:18
 * @Version 1.0
 * 双亲委派机制：指的是类加载器在加载类的时候，首先先在缓存区中查找是否加载过这个类，如果没有，则进一步委托类给父类加载器，直至到最终的BootStrapClassLoader
 * 打破双亲委派机制：以数据库驱动为例，DriverManager由BootStrapClassloader负责加载，只能够加载JAVA_HOME/lib目录下的jar包类库，但是数据库驱动实现由数据库厂商来实现
 *                  需要委托类给子类来去加载，SPI机制
 *  如何打破双亲委派机制？？？？
 *  1.重写自定义类加载器的loadClass方法
 *  2.使用SPI机制也就是ServiceLoader，底层其实借助于Threads.setContextClassloader()
 *  SPI机制一般用在父类加载器加载的类中需要使用到子类加载器加载的类
 *  比如        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tx?characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true", "root", "123456");
 *  比如getConnection方法，里面需要获取registeredDrivers
 *  之前我们会在这行代码之前写Class.forName("com.mysql.cj.jdbc.Driver");
 *  但是其实可以不用写上述这一行代码，其实便是借助于了SPI机制
 */
public class ParentsDelegating {

    public static void main(String[] args) {

    }
}
