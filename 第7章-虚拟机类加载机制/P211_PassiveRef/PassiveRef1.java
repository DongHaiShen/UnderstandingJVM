package P211_PassiveRef;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 9:25
 * @description
 */

/**
 * 被动使用类字段演示一：
 * 通过子类引用父类的静态字段，不会导致子类初始化
 **/
class SuperClass
{

    static
    {
        System.out.println("SuperClass init!");
    }

    public static int value = 123;
}

class SubClass extends SuperClass
{

    static
    {
        System.out.println("SubClass init!");
    }
}

/**
 * 非主动使用类字段演示
 **/
public class PassiveRef1
{
    public static void main(String[] args)
    {
        // 只会触发父类的初始化
        System.out.println(SubClass.value);
    }
}


