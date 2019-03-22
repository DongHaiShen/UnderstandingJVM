package P225_StaticRef;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 10:28
 * @description
 */

public class Test
{
    static
    {
        i = 0;  //  给变量复制可以正常编译通过
//        System.out.print(i);  // 这句编译器会提示 "非法向前引用" (Illegal forward reference)
    }

    static int i = 1;
}


