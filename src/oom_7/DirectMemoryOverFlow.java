package oom_7;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 远志 zhangsong@cskaoyan.onaliyun.com
 * @Date 2024-09-02 22:27
 * @Version 1.0
 */
public class DirectMemoryOverFlow {

    public static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        List<ByteBuffer> buffers = new ArrayList<ByteBuffer>();

        while (true){
            ByteBuffer buffer = ByteBuffer.allocateDirect(_1MB);
            buffers.add(buffer);
        }
    }
}
