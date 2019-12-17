package com.cm;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=profile
 */
public class BreakingTheRecords {

    public BreakingTheRecords() {
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        solution(scores);
    }

    public int[] solution(int[] scores) {
        int maxScore = 0;
        int minScore = 0;

        int maxCount = 0;
        int minCount = 0;

        maxScore = scores[0];
        minScore = scores[0];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxCount++;
            }

            if (scores[i] < minScore) {
                minScore = scores[i];
                minCount++;
            }
        }

        int[] result = {maxCount, minCount};

        return  result;
    }
}