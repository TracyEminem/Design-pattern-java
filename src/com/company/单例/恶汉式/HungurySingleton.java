package com.company.单例.恶汉式;

public class HungurySingleton { //缺点，无法延时加载,没有使用就已经加载了

    private static final HungurySingleton mInstance = new HungurySingleton();

    private HungurySingleton(){

    }

    public static HungurySingleton getHunguryInstance(){
        return mInstance;
    }

}
