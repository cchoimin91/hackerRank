package com.cm;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/string-construction/problem?h_r=profile
 */
public class StringConstruction {

    public StringConstruction() {
        String s ="abab";
        System.out.println(solution(s));
    }

    public int solution (String s){
        String[] strArr = s.split("");

        Set<String> set = new HashSet<>();

        for(int i= 0 ; i<strArr.length; i++){
            if(set.contains(strArr[i]));{
                set.add(strArr[i]);
            }
        }

        return set.size();
    }
}
