package P228_ClassLoad;

/**
 * @Author sdh
 * @Date Created in 2019/3/22 10:41
 * @description
 */

import java.io.IOException;
import java.io.InputStream;

/**
 * 类加载器与instanceof关键字演示
 */

public class ClassLoaderTest
{
    public static void main(String[] args) throws Exception
    {
        // 自定义类加载器
        ClassLoader myLoader = new ClassLoader()
        {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException
            {
                try
                {
                    String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null)
                    {
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return defineClass(name, b, 0, b.length);
                }
                catch (IOException e)
                {
                    throw new ClassNotFoundException(name);
                }
            }
        };

        // 通过自定义类加载器加载
        Object obj = myLoader.loadClass("P228_ClassLoad.ClassLoaderTest").newInstance();

        // 通过系统类加载器加载
        System.out.println(obj.getClass());

        // 由于加载器不同，因此返回false
        System.out.println(obj instanceof P228_ClassLoad.ClassLoaderTest);
    }
}


