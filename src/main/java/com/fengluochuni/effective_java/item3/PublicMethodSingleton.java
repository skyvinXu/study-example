package com.fengluochuni.effective_java.item3;

/**
 * 公有静态工厂方法单例模式
 * @author rongsheng.xu
 * @since 2019/1/24
 */
public class PublicMethodSingleton {

    private static final PublicMethodSingleton INSTANCE = new PublicMethodSingleton();

    private PublicMethodSingleton(){}

    public static PublicMethodSingleton getInstance(){
        return INSTANCE;
    }

    public void doSomething(){

    }

}
