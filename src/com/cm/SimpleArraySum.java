package com.cm;

public class SimpleArraySum {

    public SimpleArraySum(){
        int[] arr = {1,2,3};
        System.out.println(solution(arr));
    }

    int solution(int[] arr) {
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
