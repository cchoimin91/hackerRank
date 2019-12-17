package com.cm;

public class InsertionSortPart1 {

    public InsertionSortPart1() {
        int n = 5 ;
        int[] arr= {2,4,6,8,3};

        solution(n,arr);
    }

    public void solution(int n, int[] arr){
        for(int i=1 ; i<arr.length;i++){
            int standard = arr[i];
            int compare = i-1;

            while (compare>=0 && standard < arr[compare]){
                arr[compare+1] = arr[compare];
                compare--;
            }

            arr[compare+1] = standard;

            for(int j : arr){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
