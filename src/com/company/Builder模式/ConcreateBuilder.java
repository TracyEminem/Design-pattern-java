package com.company.Builder模式;

public class ConcreateBuilder extends Builder{//实现了Builder接口，实现了各个部件的具体构造和装配方法

    private Product product = new Product();

    @Override
    public void buildPartA() {
        //todo

    }

    @Override
    public void buildPartB() {
        //todo
    }
}
