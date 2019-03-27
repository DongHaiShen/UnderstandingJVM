package P395_CASTest;

import java.util.concurrent.atomic.AtomicInteger;
/**
 * @Author sdh
 * @Date Created in 2019/3/27 12:02
 * @description
 */

/**
 * Atomic变量自增运算测试
 *
 * @author zzm
 */
public class AtomicTest
{
    public static AtomicInteger race = new AtomicInteger(0);

    public static void increase()
    {
        race.incrementAndGet();
    }

    private static final int THREADS_COUNT = 20;

    public static void main(String[] args) throws Exception
    {
        Thread[] threads = new Thread[THREADS_COUNT];
        for (int i = 0; i < THREADS_COUNT; i++)
        {
            threads[i] = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    for (int i = 0; i < 10000; i++)
                    {
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        while (Thread.activeCount() > 2)
        {
            Thread.yield();
        }

        // 准确值200000
        System.out.println(race);
    }
}


