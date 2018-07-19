package com.company.单例.DLC双重检查锁;

public class DLCSingleton {

    private static volatile DLCSingleton mInstance =null; //volatile关键字是为了禁止编译器对 volatile关键字修饰的变量进行重排序，并保证volatile变量的读操作发生在写操作之后

    private DLCSingleton(){

    }

    public static DLCSingleton getmInstance(){
        if(mInstance == null){ //第一次检查
            synchronized (DLCSingleton.class){ //同步代码块
                if(mInstance == null){ //第二次检查
                    mInstance = new DLCSingleton();
                }
            }
        }
        return mInstance;
    }

}
