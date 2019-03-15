package P117_JConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sdh
 * @Date Created in 2019/3/15 15:48
 * @description
 */

/**
 * VM -Xms100m -Xmx100m -XX:+UseSerialGC
 */
public class JConsole
{
    /**
     * 内存占位符对象，一个OOMObject大约占64K
     */
    static class OOMObject
    {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException
    {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++)
        {
            // 稍作延时，令监视曲线的变化更加明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws Exception
    {
        fillHeap(1000);
    }


}
