package P226_Clinit;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 10:31
 * @description
 */

public class Clinit
{
    static class Parent
    {
        public static int A = 1;

        static
        {
            A = 2;
        }
    }

    static class Sub extends Parent
    {
        public static int B = A;
    }

    public static void main(String[] args)
    {
        System.out.println(Sub.B);
    }
}
