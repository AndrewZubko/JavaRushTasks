package com.javarush.task.task35.task3512;

public class Generator<T> {
    Class<T> newClass;

    T newInstance() throws IllegalAccessException, InstantiationException {
        return newClass.newInstance();
    }

    public Generator(Class<T> newClass) {
        this.newClass = newClass;
    }
}
