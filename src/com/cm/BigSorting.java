package com.cm;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/big-sorting/problem
 */
public class BigSorting {

    public BigSorting() {
        String[] unsorted = {"31415926535897932384626433832795","1","10","3","5"};
        System.out.println(solution2(unsorted));
    }

    /**
     * time out
     * case 6개
     */
    public String[] solution(String[] unsorted){
        int size = unsorted.length;

        BigInteger[] num= new BigInteger[size];
        for(int i= 0 ; i<size;i++){
            num[i] = new BigInteger(unsorted[i]);
        }

        Arrays.sort(num);

        String[] result = new String[size];
        for(int j=0 ; j<size; j++){
            result[j] = String.valueOf(num[j]);
        }

        return result;
    }

    /**
     * time out
     * case 1개
     */
    public String[] solution2(String[] unsorted){
            Arrays.sort(unsorted, new Comparator<String>(){

                @Override
                public int compare(String o1, String o2) {
                    if(o1.length() > o2.length()) return 1;

                    if(o1.length()<o2.length()) return -1;

                    for(int i =0; i<o1.length();i++){
                        if((int)o1.charAt(i)>(int)o2.charAt(i))   return 1;

                        if((int)o1.charAt(i)<(int)o2.charAt(i))   return -1;
                    }

                    return 0;
                }
            });
            return unsorted;
    }
}
