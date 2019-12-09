package com.cm;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class VeryBigSum {
    public VeryBigSum(){
        long[] arr ={};
        System.out.println(solution(arr));
    }

    public long solution(long[] arr){
        long sum = 0;
        for(long i: arr){
            sum+=i;
        }
        return sum;
    }
}
