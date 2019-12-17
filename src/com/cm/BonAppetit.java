package com.cm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem?h_r=profile
 */
public class BonAppetit {

    public BonAppetit() {
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        int k = 1;
        int b = 12;

        solution(bill, k, b);
    }

    public void solution(List<Integer> bill, int k, int b){
        bill.remove(k);

        Integer halfMoney = (bill.stream().collect(Collectors.summingInt(Integer::intValue))) / 2;

        if(b == halfMoney){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - halfMoney);
        }
    }
}
