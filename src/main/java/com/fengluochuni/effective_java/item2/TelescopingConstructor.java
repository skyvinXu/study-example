package com.fengluochuni.effective_java.item2;

/**
 * 重叠构造器
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class TelescopingConstructor {

    private final int servingSize; //required

    private final int servings; //required

    private final int fat;

    private final int sodiums;

    public TelescopingConstructor(int servingSize, int servings){
        this(servingSize,servings,0,0);
    }

    public TelescopingConstructor(int servingSize, int servings, int fat, int sodiums){
        this.servingSize = servingSize;
        this.servings = servings;
        this.fat = fat;
        this.sodiums = sodiums;
    }

}
