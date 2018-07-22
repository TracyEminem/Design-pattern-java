package com.company.Builder模式;

public class Director { //指挥者，负责安排复杂对象的构建次序，指挥者与抽象建造者之间存在关联关系

    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        return builder.getProduct();
    }

}
