package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods someInterfaceWithMethods;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object m = method.invoke(someInterfaceWithMethods, args);
        System.out.println(method.getName() + " out");
        return m;
    }

    public CustomInvocationHandler(SomeInterfaceWithMethods someInterfaceWithMethods1) {
        this.someInterfaceWithMethods = someInterfaceWithMethods1;
    }
}
