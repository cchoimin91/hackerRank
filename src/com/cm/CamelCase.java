package com.cm;

/**
 * https://www.hackerrank.com/challenges/camelcase/problem?h_r=profile
 */
public class CamelCase {

    public CamelCase() {
        String s ="saveChangesInTheEditor";
        System.out.println(solution(s));
    }

    public int solution (String s){
        int count = 1;

        char[] ch = s.toCharArray();

        for(int i=0 ;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                count++;
            }
        }

        return count;
    }
}
