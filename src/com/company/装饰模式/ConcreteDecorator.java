package com.company.装饰模式;

public class ConcreteDecorator extends Decorator{


    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operations() {
        super.operations();  //调用原有业务的方法
        addedBehavior();//调用新增的业务方法
    }

    public void addedBehavior(){
        //todo
    }
}
