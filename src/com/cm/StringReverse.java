package com.cm;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse
 */
public class StringReverse {

    public StringReverse() {
        //solution();
        solution2();
    }

    public void solution(){
        Scanner sc=new Scanner(System.in);
        String a =sc.next();

        StringBuilder sb = new StringBuilder(a);
        sb.reverse();

        System.out.println(a.equals(sb.toString())?"Yes":"No");
    }

    public void solution2() {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int startIdx = 0, endIdx = a.length()-1 ; startIdx < a.length(); startIdx++, endIdx--) {
            if (a.charAt(startIdx) != a.charAt(endIdx)) {
                System.out.println("No");
                break;
            }

            // input = "a"  startIdx == endIdx
            if(startIdx > endIdx || startIdx == endIdx){
                System.out.println("Yes");
                break;
            }
        }
    }
}
