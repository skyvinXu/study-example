package com.fengluochuni.effective_java.item1.service;

/**
 * 提供者
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public interface Provider {

    Service newInstance();
}
