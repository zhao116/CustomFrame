package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * 使用类加载器读取配置文件的类
 */
public class Resources {


    /**
     *根据传入的参数,获取一个字节数入流
     */

    public static InputStream getResourceAsStream(String filePath){
        //1.拿到字节码，2.拿到类加载器 3.根据类加载器读取文件
        return  Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
