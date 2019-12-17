package com.cm;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem?h_r=profile
 */
public class AngryProfessor {

    public AngryProfessor() {
        int k = 2 ;
        int[] a = {0,-1,2,1};
        System.out.println(solution(k,a));
    }

    public String solution(int k, int[] a){
        int readyStudentCount = 0;

        for(int i : a){
            if(i == 0 || i<0){
                readyStudentCount ++;
            }
        }
        return  k<=readyStudentCount?"NO":"YES";
    }

}
