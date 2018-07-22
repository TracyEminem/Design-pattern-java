package com.company;

import com.company.Adapter对象适配器模式.Adaptee;
import com.company.Adapter类适配器模式.Adapter;
import com.company.Builder模式.Builder;
import com.company.Builder模式.ConcreateBuilder;
import com.company.Builder模式.Director;
import com.company.Builder模式.Product;
import com.company.单例.DLC双重检查锁.DLCSingleton;
import com.company.单例.恶汉式.HungurySingleton;
import com.company.单例.懒汉式.LazySingleton;
import com.company.单例.懒汉式线程安全.SafeLazySingleton;
import com.company.单例.枚举.EnumSingleton;
import com.company.单例.静态内部类.StaticInnerSingleton;
import com.company.外观设计模式.Facade;
import com.company.装饰模式.Component;
import com.company.装饰模式.ConcreteComponent;
import com.company.装饰模式.ConcreteDecorator;
import com.company.装饰模式.Decorator;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //单例模式
        HungurySingleton.getHunguryInstance();
        LazySingleton.getmInstance();
        SafeLazySingleton.getmInstance();
        DLCSingleton.getmInstance();
        StaticInnerSingleton.getIntance();
        EnumSingleton enumSingleton = EnumSingleton.INTANCE;

        //builder模式   优点：松散耦合，产品的构建和产品的表现上分离，更好的复用性     缺点：产生多余的builder对象，以及directory对象。消耗内存，暴露了对象的构建过程，android中的运用，alertDialog,glide,okhttp
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);
        Product product = director.construct();// 平时使用会忽略掉director和Builder直接使用product和concreteBuilder来创建

        //Adapter类适配器模式 使用对象继承创建是静态的定义方式 adapter可以重新定义adaptee部分  对于adapter仅引入一个对象不需要额外的引用来间接得到adaptee adapter由于继承了adaptee无法和adaptee子类一起工作
        Adapter adapter = new Adapter();
        adapter.func2();
        adapter.func1();//调用了adaptee中的func1方法
        //Adapter对象适配器模式 把被适配的类的api转换为目标类的api，与类适配器不同不是继承adaptee类而是使用委派关系链接到adaptee类
        // 1使用对象组合是动态组合 2一个适配器可以把多个不同的源适配到同一个目标 3但是需要重定义adaptee是比较困难 4需要额外的间接引用才能得到adaptee  android中应用Llistview recycleview
        //每个item是一个view，用adapter将view添加到listview/recyclerview中  MVC架构，listview/recyclerview的adapter相当于controller
        Adaptee adaptee = new Adaptee();
        com.company.Adapter对象适配器模式.Adapter adapter1 = new com.company.Adapter对象适配器模式.Adapter(adaptee);
        adapter1.func1();
        adapter1.func2();


        //装饰模式 动态将对象增加一些额外的职责  场景：1在不影响其他对象的情况下，以动态透明的方式给单个对象增加职责  2当不能利用继承的方式对系统进行拓展时和利用继承不利于系统的拓展和维护时可以使用装饰模式
        //1拓展功能装饰模式更灵活，不会导致类的个数激增 2可以通过动态加载的方式来扩张对象和功能  3可以对一个对象进行多次装饰，通过使用不同的具体装饰类以及这些装饰类的排列组合
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operations();



        //外观设计模式 目的是为了让外部减少与子系统内部多个模块的交互，从而让外部能更简单的使用系统，，他负责把客户端的请求转发给子系统内部的各个模块进行处理
        //场景：1,需要为一个复杂子系统提供一个简单的接口时 2，客户端与抽象类的实现部分之间存在很大的依赖 3，需要构建一个层次结构的子系统时
        //优点：1,封装了各个模块交互的过程，内部模块调用关系发生变化，只要更改Facade实现就行。2.Facade实现是可以被多个客户端调用的。3.Module模块化代码发生改变，不会影响调用
        Facade.getInstance().operation();

        //组合设计模式：将对象以树形结构组织起来，使客户端对单个对象和组合对象的使用具有一致性
        //场景：1，需要表示一个对象整体或者部分层次 2，让客户能够忽略不同对象层次的变化

    }
}
