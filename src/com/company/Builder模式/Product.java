package com.company.Builder模式;

public class Product { //被构建的复杂对象，包含各个组成部件

    private String A;
    private String B;

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }
}
