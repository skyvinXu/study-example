package com.fengluochuni.effective_java.item2;

/**
 * JavaBean模式
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class JavaBean {

    private int servingSize; //required

    private int servings; //required

    private int fat;

    private int sodiums;

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getSodiums() {
        return sodiums;
    }

    public void setSodiums(int sodiums) {
        this.sodiums = sodiums;
    }
}
