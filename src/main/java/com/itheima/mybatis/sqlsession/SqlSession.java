package com.itheima.mybatis.sqlsession;

/**
 * 自定义Mybatis中和数据库交互的核心类
 * 可以创建Dao接口的对象
 */
public interface SqlSession {
    /**
     *
     * @param daoInterfaceClass dao的接口字节码
     * @param <T>
     * @return
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /*
        释放资源
     */
    void close();
}
