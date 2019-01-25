package com.fengluochuni.effective_java.item5;

/**
 * 自动装箱
 * @author rongsheng.xu
 * @since 2019/1/24
 */
public class AutoBoxing {

    public static void main(String[] args) {
        // 应将 Long型 改为 long,否则 将创建 多余的Long对象
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}


