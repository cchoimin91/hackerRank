package com.cm;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor/problem?h_r=profile
 */
public class IceCreamParlor {

    public IceCreamParlor() {
        int[] arr ={1 ,3 ,4 ,6 ,7 ,9};
        int m = 9;
        System.out.println(solution(m,arr));
    }

    public int[] solution(int m, int[] arr) {
        int[] result = new int[2];

        for(int i=0; i<arr.length; i++){
            for(int j =i+1 ;j<arr.length; j++){
                if(arr[i] + arr[j] == m){
                    result[0] = i+1;
                    result[1] = j+1;
                }
            }
        }

        return result;
    }
}
