package com.cm;

import java.util.regex.Matcher;

/**
 * https://www.hackerrank.com/challenges/strong-password?h_r=profile
 */
public class StrongPassword {

    public StrongPassword(){
        String  password ="";
        System.out.println(solution(password.length(), password));
    }

    public int solution (int n, String password){
        int result = 0;
        final int limitSize = 6;
        final String characters = "!@#$%^&*()-+";

        int lowCount = 0;
        int upperCount = 0;
        int numberCount = 0;
        int specialCharactersCount = 0;

        char[] cha = password.toCharArray();

        for(int i= 0 ; i<password.length();i++){
            if(Character.isUpperCase(cha[i])) upperCount++;
            if(Character.isLowerCase(cha[i])) lowCount++;
            if(cha[i]>47 && cha[i]<58) numberCount++;
            if(characters.contains(Character.toString(cha[i]))) specialCharactersCount++;
        }

        //일치하지는 항목이 있으면 카운트 증가
        if(lowCount==0) result++;
        if(upperCount==0) result++;
        if(numberCount==0) result++;
        if(specialCharactersCount==0) result++;

        if(password.length() < limitSize){
            if(result == 0){ // 조건은 모두 일치, 길이만 통과하지 못함
                return  limitSize - password.length(); // 부족한 길이 반환
            }else{ //조건 일부만 일치 + 길이부족
                return limitSize - (4 - result);
            }
        }

        return result;
    }

}
