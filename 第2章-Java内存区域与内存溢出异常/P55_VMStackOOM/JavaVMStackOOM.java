package P55_VMStackOOM;

/**
 * @Author sdh
 * @Date Created in 2019/3/13 16:35
 * @description
 */

/**
 * VM Args：-Xss2M
 */
public class JavaVMStackOOM
{

    private void dontStop()
    {
        while (true)
        {
        }
    }

    public void stackLeakByThread()
    {
        while (true)
        {
            Thread thread = new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable
    {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}