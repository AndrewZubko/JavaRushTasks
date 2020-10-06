package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 10000);
    }

    static Set<Long> getIds(Shortener shortener, Set<String> strings){
        Set<Long> setOfKeys = new HashSet<>();

        for (String id : strings) {
            setOfKeys.add(shortener.getId(id));
        }

        return setOfKeys;
    }

    static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> setOfStrings = new HashSet<>();

        for (Long value : keys){
            setOfStrings.add(shortener.getString(value));
        }

        return setOfStrings;
    }

    static void testStrategy(StorageStrategy strategy, long elementsNumber){
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> testStrings = new HashSet<>();
        for (int i = 0; i < elementsNumber; i++) {
            testStrings.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);
        Date startDate = new Date();
        Set<Long> ids = getIds(shortener, testStrings);
        Date finishDate = new Date();
        long timeOfGetIdsTest = finishDate.getTime() - startDate.getTime();
        Helper.printMessage(Long.toString(timeOfGetIdsTest));

        startDate = new Date();
        Set<String> strings = getStrings(shortener, ids);
        finishDate = new Date();
        timeOfGetIdsTest = finishDate.getTime() - startDate.getTime();
        Helper.printMessage(Long.toString(timeOfGetIdsTest));

        if (testStrings.equals(strings)) {
            Helper.printMessage("Тест пройден.");
        } else {
            Helper.printMessage("Тест не пройден.");
        }
    }
}
