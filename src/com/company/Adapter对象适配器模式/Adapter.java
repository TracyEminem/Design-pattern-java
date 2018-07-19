package com.company.Adapter对象适配器模式;

public class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void func1() {
        adaptee.func1();
    }

    @Override
    public void func2() {
        //todo
    }
}
