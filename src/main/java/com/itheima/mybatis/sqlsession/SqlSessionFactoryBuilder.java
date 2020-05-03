package com.itheima.mybatis.sqlsession;


import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.itheima.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 *用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {
    /*
        根据参数的字节数入流来构建一个SqlSessionFactory工厂
     */
        public SqlSessionFactory build(InputStream config){
            Configuration cfg = XMLConfigBuilder.loadConfiguration(config);

            return  new DefaultSqlSessionFactory(cfg);
        }
}