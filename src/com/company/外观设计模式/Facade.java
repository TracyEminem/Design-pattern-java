package com.company.外观设计模式;

public class Facade {

    private static Facade mFacade = null;

    private ModuleA moduleA =null;
    private ModuleB moduleB =null;

    public Facade() {
        moduleA = new ModuleA();
        moduleB = new ModuleB();
    }

    public static Facade getInstance(){ //单例

        if(mFacade == null){
            mFacade = new Facade();
        }
        return mFacade;
    }

    public void operation(){
        moduleA.test();
        moduleB.test();
    }
}
