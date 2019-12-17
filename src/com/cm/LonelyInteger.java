package com.cm;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/lonely-integer/problem?h_r=profile
 */
public class LonelyInteger {

    public LonelyInteger() {
        int[] a={0 ,0 ,1 ,2 ,1};
        System.out.println(solution(a));
    }

    public int solution(int[] a){
        Set<Integer> set = new HashSet<>();

        for(int i=0 ;i<a.length;i++){
            if(set.contains(a[i])){
                set.remove(a[i]);
            }else{
                set.add(a[i]);
            }
        }

        for(int j : set){
            return j;
        }

        return 0;
    }
}
