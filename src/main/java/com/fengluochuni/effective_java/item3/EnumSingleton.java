package com.fengluochuni.effective_java.item3;

import java.util.HashMap;
import java.util.Map;

/**
 * 枚举单例模式[Enum Singleton Model]
 * @author rongsheng.xu
 * @since 2019/1/24
 */
public enum EnumSingleton {

    INSTANCE;

    private Map<String,String> configMap = new HashMap<String,String>();

    public void doSomething(){
        System.out.println("configMap size:"+configMap.size());
    }

    public void reloadConfig(){
        configMap.put("a","a");
    }

}
