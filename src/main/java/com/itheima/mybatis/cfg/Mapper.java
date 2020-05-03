package com.itheima.mybatis.cfg;

/**
 * 用于封装执行SQL语句和结果类型的全限定内明
 */
public class Mapper {
    private String queryString;//SQL
    private String ResultType;//全限定类名

    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String queryString) {
        this.queryString = queryString;
    }

    public String getResultType() {
        return ResultType;
    }

    public void setResultType(String restltType) {
        ResultType = restltType;
    }
}
