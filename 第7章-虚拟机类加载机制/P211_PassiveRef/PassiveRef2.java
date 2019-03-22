package P211_PassiveRef;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 9:27
 * @description
 */

/**
 * 被动使用类字段演示二：
 * 通过数组定义来引用类，不会触发此类的初始化
 **/
public class PassiveRef2
{
    public static void main(String[] args)
    {
        // 没有触发SuperClass的初始化
        SuperClass[] sca = new SuperClass[10];
    }
}


