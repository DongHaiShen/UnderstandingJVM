package P239_Slot;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 14:46
 * @description
 */
public class Slot3
{
    public static void main(String[] args)
    {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }

        int a = 0;
        System.gc(); // 已回收
    }
}
