package com.cm;

import java.util.ArrayList;
import java.util.List;

public class FunnyString {
    /**
     * https://www.hackerrank.com/challenges/funny-string/problem?h_r=profile
     */
    public FunnyString() {
        String s ="ptvzstvotxqyvzrwyqryzrpkswzryupwutmigc";
        System.out.println(solution(s));
    }

    public String solution (String s){
        char[] ascChar = s.toCharArray();

        List<Integer> origin = new ArrayList<>();
        List<Integer> revers = new ArrayList<>();

        for(int asc :  ascChar){
            origin.add(asc);
        }

        for(int i=ascChar.length-1 ; i>=0; i--){
            revers.add((int)ascChar[i]);
        }

        List<Integer> originGap = new ArrayList<>();
        List<Integer> reversGap = new ArrayList<>();

        for(int i =0 ; i<origin.size()-1;i++){
            int gap = origin.get(i+1) - origin.get(i);
            originGap.add(gap);
        }

        for(int j=0 ; j<revers.size()-1 ; j++){
            int gap = revers.get(j) - revers.get(j+1);
            reversGap.add(gap);
        }

        for(int i=0; i<originGap.size();i++){
            if(Math.abs(originGap.get(i)) != Math.abs(reversGap.get(i))){
                return "Not Funny";
            }
        }

        return "Funny";
    }

}
