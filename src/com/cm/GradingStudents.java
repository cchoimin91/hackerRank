package com.cm;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/grading/problem?h_r=profile
 */
public class GradingStudents {

    private final int MULTIPLE = 5;
    private final int ROUND_STANDARD = 3;

    public GradingStudents() {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(40);
        grades.add(33);
        System.out.println(solution(grades));
    }

    public List<Integer> solution (List<Integer> grades){
        List<Integer> result = new ArrayList<>();

        for(int grade :  grades) {

            if(grade<38){
                result.add(grade);
            }else{
                int standardScore =  grade + MULTIPLE - (grade % MULTIPLE );

                if(standardScore - grade < ROUND_STANDARD){
                    result.add(standardScore);
                }else{
                    result.add(grade);
                }
            }
        }

            return result;
    }
}
