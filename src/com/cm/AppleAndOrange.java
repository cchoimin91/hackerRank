package com.cm;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=profile
 */
public class AppleAndOrange {

    public AppleAndOrange() {
        int s = 7; // 집 시작점
        int t = 11; // 집 끝점
        int a = 5; //사과나무
        int b = 15; // 오렌지나무
        int[] apples ={-2,2,1};
        int[] oranges ={5,-6};

        solution(s,t,a,b,apples,oranges);
    }

    public void solution (int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangesCount = 0;

        for(int i=0 ;i<apples.length;i++){
            if(s<=(a+apples[i]) && t>=(a+apples[i])){
                appleCount++;
            }
        }

        for(int j=0 ;j<oranges.length;j++){
            if(s<=(b+oranges[j]) && t>=(b+oranges[j])){
                orangesCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangesCount);
    }
}
