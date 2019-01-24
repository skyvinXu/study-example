package com.fengluochuni.effective_java.item1.service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * 服务注册及访问
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class Services {

    private Services(){}

    private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

    private static final String DEFAULT_PROVIDER_NAME = "<def>";

    /**
     * 注册服务提供者
     * @param provider
     */
    public static void registerDefaultProvider(Provider provider){
        registerProvider(DEFAULT_PROVIDER_NAME, provider);
    }

    public static void registerProvider(String name,Provider provider){
        providers.put(name, provider);
    }

    /**
     * 服务访问API
     * @return
     */
    public static Service newInstance(){
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider provider = providers.get(name);
        if(provider == null){
            throw new IllegalArgumentException("no provider registered with name:" + name);
        }
        return provider.newInstance();
    }


}
