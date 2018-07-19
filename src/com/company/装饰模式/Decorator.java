package com.company.装饰模式;

public class Decorator implements Component{

    private Component component;   //注入一个抽象构建对象的引用

    public Decorator(Component component) { //注入一个抽象构建类型的对象
        this.component = component;
    }

    @Override
    public void operations() {
        component.operations(); //调用原业务的方法
    }

}
