package com.fengluochuni.effective_java.item3;

/**
 *
 * @author rongsheng.xu
 * @since 2019/1/24
 */
public class Client {

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.reloadConfig();

        EnumSingleton.INSTANCE.doSomething();
    }
}
