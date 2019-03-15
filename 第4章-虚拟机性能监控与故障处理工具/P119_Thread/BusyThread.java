package P119_Thread;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @Author sdh
 * @Date Created in 2019/3/15 15:59
 * @description
 */
public class BusyThread
{
    /**
     * 线程死循环演示
     */
    public static void createBusyThread()
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                while (true)
                {
                    ;
                }
            }
        }, "testBusyThread");
        thread.start();
    }

    /**
     * 线程锁等待演示
     */
    public static void createLockThread(final Object lock)
    {
        Thread thread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                synchronized (lock)
                {
                    try
                    {
                        lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }, "testLockThread");
        thread.start();
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        createBusyThread();
        br.readLine();
        Object obj = new Object();
        createLockThread(obj);
    }


}
