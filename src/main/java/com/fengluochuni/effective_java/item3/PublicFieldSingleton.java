package com.fengluochuni.effective_java.item3;

/**
 * 公有静态域单例模式
 *
 * @author rongsheng.xu
 * @since 2019/1/24
 */
public class PublicFieldSingleton {

    public static final PublicFieldSingleton INSTANCE = new PublicFieldSingleton();

    private PublicFieldSingleton(){}

    public void doSomething(){

    }

}
