package com.cm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {
    public DiagonalDifference() {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(2);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);

        arr.add(list1);
        arr.add(list2);
        arr.add(list3);

        System.out.println(solution(arr));
    }

    public int solution(List<List<Integer>> arr){
        int leftNum = 0 ;
        int rightNum = 0;

        int leftCount = 0;
        int rightCount = arr.size();

        for(int i =0; i<arr.size(); i++){
                leftNum += arr.get(i).get(leftCount);
                rightNum += arr.get(i).get(rightCount-1);
                leftCount ++;
                rightCount --;
        }

        return  Math.abs(leftNum - rightNum);
    }
}
