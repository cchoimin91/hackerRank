package com.cm;

/**
 * https://www.hackerrank.com/challenges/java-singleton/problem
 */
public class SingletonPattern {

    public String str;
    private static SingletonPattern instance = null;

    private SingletonPattern(){
    }

    public static SingletonPattern getInstance(){
        if (instance==null) instance = new SingletonPattern();
        return instance;
    }

}
