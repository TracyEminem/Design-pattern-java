package com.company.单例.懒汉式线程安全;

public class SafeLazySingleton { //性能有缺陷

    private static SafeLazySingleton mInstance;

    private SafeLazySingleton(){

    }

//    public static synchronized SafeLazySingleton getmInstance() {//在方法中声明同步方法
//        if(mInstance == null){
//            mInstance = new SafeLazySingleton();
//        }
//        return mInstance;
//    }
//    或者
    public static SafeLazySingleton getmInstance(){ //同步代码块
        synchronized (SafeLazySingleton.class){
            if(mInstance == null){
                mInstance = new SafeLazySingleton();
            }
            return mInstance;
        }
    }
}
