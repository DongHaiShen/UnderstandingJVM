package P56_ConstantPoolOOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sdh
 * @Date Created in 2019/3/14 11:33
 * @description
 */

/**
 * VM Args：-XX:PermSize=10M -XX:MaxPermSize=10M
 */
public class RuntimeConstantPoolOOM
{
    public static void main(String[] args)
    {
        // 使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<>();

        // 10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;

        // JDK1.7不报错
        while (true)
        {
            list.add(String.valueOf(i++).intern());
        }
    }
}

