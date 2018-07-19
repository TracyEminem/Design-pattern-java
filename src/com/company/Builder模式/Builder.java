package com.company.Builder模式;

public abstract class Builder { //为一个产品product对象的各个部件指定抽象接口

    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();

    public Product getProduct() {
        return product;
    }
}
