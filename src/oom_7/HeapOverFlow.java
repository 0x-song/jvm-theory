package oom_7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-09-02 21:49
 * @Version 1.0
 */
public class HeapOverFlow {

//    static int[] array = new int[1024 * 1024];

    static List<HeapOverFlow> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1);
            run();
        }
    }

    private static void run() {
        List<HeapOverFlow> objs = new ArrayList<>();
        objs.add(new HeapOverFlow());
        list.add(new HeapOverFlow());
    }
}
