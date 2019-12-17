package com.cm;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?h_r=profile
 */
public class DivisibleSumPairs {

    public DivisibleSumPairs() {
        int n = 6;
        int k = 3;
        int[] ar = {1, 3, 2, 6, 1, 2};
        System.out.println(solution(n, k, ar));
    }

    int solution(int n, int k, int[] ar) {
        int result = 0;

        for (int i = 0; i < ar.length - 1; i++) {
            for(int j=i+1; j<ar.length;j++){
                if((ar[i]+ar[j]) % k == 0){
                    result ++ ;
                }
            }
        }
        return result;
    }
}
