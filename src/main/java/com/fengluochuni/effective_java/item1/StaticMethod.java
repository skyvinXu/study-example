package com.fengluochuni.effective_java.item1;

/**
 * 静态工厂方法
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class StaticMethod {

    private static final StaticMethod instance = new StaticMethod();

    /**
     * 静态工厂方法
     * @return
     */
    public static StaticMethod newInstance(){
        return instance;
    }

}
