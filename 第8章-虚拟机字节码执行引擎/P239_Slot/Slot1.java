package P239_Slot;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 14:42
 * @description
 */
public class Slot1
{
    public static void main(String[] args)
    {
        byte[] placeholder = new byte[64 * 1024 * 1024];

        // 未回收
        System.gc();
    }
}
