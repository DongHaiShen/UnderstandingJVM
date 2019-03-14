package P51_HeapOOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sdh
 * @Date Created in 2019/3/13 15:56
 * @description
 */

/**
 * VM Args：-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 */
public class HeapOOM
{
    static class OOMObject
    {
    }

    public static void main(String[] args)
    {
        List<OOMObject> list = new ArrayList<>();

        while (true)
        {
            list.add(new OOMObject());
        }
    }
}


