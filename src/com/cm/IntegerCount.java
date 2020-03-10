package com.cm;

import java.util.*;

public class IntegerCount {

    public IntegerCount() {
        String str = "33333122";
        solution(str);
    }

    public void solution(String str) {
        char[] chaArr = str.toCharArray();

        //중복제거
        Set<Integer> distinct = new HashSet<Integer>();
        for(char cha : chaArr){
            distinct.add(Character.getNumericValue(cha));
        }

        // 각 숫자의 개수를 센다
        int[] intCount = new int[distinct.size()];
        int j = 0; // 입력할 숫자의 인덱스
        for(int i : distinct){
            for(int z=0; z<chaArr.length; z++){
                if(i==Character.getNumericValue(chaArr[z])){
                    intCount[j] ++;
                }
            }
            j++;
        }

        //숫자와 개수를 맵핑
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        int x = 0; // 숫자카운트 인덱스를 위한 변수
        for(int i : distinct){
            map.put(String.valueOf(i), intCount[x]);
            x++;
        }

        //가장 큰 value 찾기
        int maxValue = Collections.max(map.values());

        //가장 큰값을 가진 KEY 찾기

        //가장 큰 값을가진 MAP 찾기
        Map.Entry<String, Integer> maxEntry = Collections.max(map.entrySet(), new Comparator<Map.Entry<String , Integer>>() {
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        //가장 작은 value 찾기
        int minValue = Collections.min(map.values());

        System.out.println(map.values());

        System.out.println("");
    }


}
