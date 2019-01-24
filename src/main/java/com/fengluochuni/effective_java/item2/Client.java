package com.fengluochuni.effective_java.item2;

/**
 * 客户端
 * @author rongsheng.xu
 * @since 2019/1/23
 */
public class Client {

    public static void main(String[] args) {
        //重叠构造器模式
        TelescopingConstructor telescopingConstructor = new TelescopingConstructor(1,2,0,0);

        //JavaBean模式
        JavaBean javaBean = new JavaBean();
        javaBean.setServingSize(1);
        javaBean.setServings(2);
        javaBean.setFat(0);
        javaBean.setSodiums(0);

        //构建者模式
        BuilderModel builderModel = new BuilderModel.Builder(1,2).fat(0).sodiums(0).build();


    }
}
