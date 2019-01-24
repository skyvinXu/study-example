package com.fengluochuni.effective_java.item2;

/**
 * 构建者模式
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class BuilderModel {

    private final int servingSize; //required

    private final int servings; //required

    private final int fat;

    private final int sodiums;

    public BuilderModel(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.fat = builder.fat;
        this.sodiums = builder.sodiums;
    }

    public static class Builder{
        //required
        private final int servingSize;
        private final int servings;
        //optional-default value
        private int fat = 0;
        private int sodiums = 0;

        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder fat(int val){
            fat = val;
            return this;
        }
        public Builder sodiums(int val){
            sodiums = val;
            return this;
        }
        public BuilderModel build(){
            return new BuilderModel(this);
        }
    }
}
