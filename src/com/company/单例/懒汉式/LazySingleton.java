package com.company.单例.懒汉式;

public class LazySingleton {//缺点，多线程并发的时候会失效，getmInstance不同步，例子：一个线程在创建mInstance时，还未创建完成，另一个线程访问mInstance此时还是为空，又创建了一次

    private static LazySingleton mInstance;

    private LazySingleton(){

    }

    public static LazySingleton getmInstance(){
        if(mInstance == null){
            mInstance = new LazySingleton();
        }
        return mInstance;
    }

}
