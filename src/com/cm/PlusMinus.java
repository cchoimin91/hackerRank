package com.cm;

import java.math.BigDecimal;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem?h_r=profile
 */
public class PlusMinus {

    public PlusMinus() {
        int[] arr ={-4, 3, -9, 0 ,4 ,1};
        solution(arr);
    }

    public void solution(int[] arr){
        int plus = 0;
        int minus = 0;
        int zero = 0;

        int size = arr.length;

        for(int i : arr){
            if(i>0){
                plus++;
            }else if(i<0){
                minus++;
            }else{ // zero
                zero++;
            }
        }

        System.out.println(new BigDecimal(plus).divide(new BigDecimal(size), 6,BigDecimal.ROUND_DOWN ));
        System.out.println(new BigDecimal(minus).divide(new BigDecimal(size), 6,BigDecimal.ROUND_DOWN ));
        System.out.println(new BigDecimal(zero).divide(new BigDecimal(size), 6,BigDecimal.ROUND_DOWN ));
    }
}
