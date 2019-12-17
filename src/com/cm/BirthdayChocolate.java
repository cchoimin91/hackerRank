package com.cm;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem?h_r=profile
 */
public class BirthdayChocolate {

    public BirthdayChocolate() {
        List<Integer> s = Arrays.asList(1,2,1,3,2);
        int d = 3; // 합
        int m = 2; // 배열 개수
        System.out.println(solution(s,d,m));
    }

    public int solution(List<Integer> s , int d, int m){
        int count = 0;
        int sum = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            sum = 0;
            for (int j = i; j < i+m; j++) {
                sum += s.get(j);
            }
            if(sum==d)
                count++;
        }
        return count;
    }

}
