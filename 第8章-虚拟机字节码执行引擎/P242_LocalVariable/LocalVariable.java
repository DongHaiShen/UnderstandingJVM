package P242_LocalVariable;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 14:48
 * @description
 */
public class LocalVariable
{
    int b; // 类变量

    public static void main(String[] args)
    {
        int a; // 局部变量

//        System.out.println(a); // 局部变量无默认值，抛出 Variable 'a' might not have been initialized

        System.out.println(new LocalVariable().b); // 类变量有默认值，可正常运行
    }
}

