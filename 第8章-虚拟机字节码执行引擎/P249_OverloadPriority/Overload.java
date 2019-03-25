package P249_OverloadPriority;

import java.io.Serializable;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 15:53
 * @description
 */

public class Overload
{
    public static void sayHello(Object arg)
    {
        System.out.println("hello Object");
    }

    public static void sayHello(int arg)
    {
        System.out.println("hello int");
    }

    public static void sayHello(long arg)
    {
        System.out.println("hello long");
    }

    public static void sayHello(Character arg)
    {
        System.out.println("hello Character");
    }

    public static void sayHello(char arg)
    {
        System.out.println("hello char");
    }

    public static void sayHello(char... arg)
    {
        System.out.println("hello char ...");
    }

    public static void sayHello(Serializable arg)
    {
        System.out.println("hello Serializable");
    }

    public static void main(String[] args)
    {
        sayHello('a');

        // Overload 优先级
        // 1. hello char
        // 2. hello int
        // 3. hello long
        // 4. hello Character
        // 5. hello Serializable
        // 6. hello Object
        // 7. hello char ...
    }
}


