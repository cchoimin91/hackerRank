package com.cm;

import com.cm.codingTest.Convert;
import com.cm.codingTest.IntegerCount;

public class Main {

    public static void main(String[] args) {
	    System.out.println(">>> 실행");

	    SingletonPattern s1 =SingletonPattern.getInstance();

        SingletonPattern s2 =SingletonPattern.getInstance();

        System.out.println(">>> 종료");
    }
}
