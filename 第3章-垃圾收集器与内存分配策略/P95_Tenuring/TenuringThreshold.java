package P95_Tenuring;

/**
 * @Author sdh
 * @Date Created in 2019/3/14 19:06
 * @description
 */

/**
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution
 */
public class TenuringThreshold
{
    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void main(String args[])
    {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];  // 什么时候进入老年代决定于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
