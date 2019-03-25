package P313_GenericTypes;

import java.util.List;

/**
 * @Author sdh
 * @Date Created in 2019/3/25 15:28
 * @description
 */
public class GenericTypes
{
    // 'method(List<String>)' clashes with 'method(List<Integer>)'; both methods have same erasure
    // 编译错误，因为类型擦除后参数类型相同，都是 List<E>

//    public static void method(List<String> list)
//    {
//        System.out.println("invoke method(List<String> list)");
//    }

    public static void method(List<Integer> list)
    {
        System.out.println("invoke method(List<Integer> list)");
    }
}


