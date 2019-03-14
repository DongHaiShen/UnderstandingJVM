package P94_Pretenure;

/**
 * @Author sdh
 * @Date Created in 2019/3/14 18:49
 * @description
 */

/**
 * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 */
public class PretenureSizeThreshold
{
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args)
    {
        byte[] allocation;
        allocation = new byte[4 * _1MB];  //直接分配在老年代中
    }
}
