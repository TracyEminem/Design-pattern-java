package com.company.单例.静态内部类;

public class StaticInnerSingleton { //完成了懒汉式的延迟加载，同时static保证了线程安全。

    private  StaticInnerSingleton(){

    }

    public static StaticInnerSingleton getIntance(){
        return SingletonHolder.mIntance;
    }

    private static class SingletonHolder{ //私有的，初始化的时候，没有调用getIntance方法则不会加载
        private static final StaticInnerSingleton mIntance = new StaticInnerSingleton();  //static,final是jvm提供的同步机制，初始化后就无法修改了
    }

}
