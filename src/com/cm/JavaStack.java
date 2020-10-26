package com.cm;

import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/java-stack/problem
 */
public class JavaStack {

    public JavaStack() {
        solution();
    }

    public void solution(){
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        boolean result = true;

        while (sc.hasNext()) {
            String input=sc.next();

            if(input.length()%2>0){ // 괄호의 개수는 짝수여야 함
                result = false;
            }else{
                String[] arr = input.split("");

                for (int i=0 ; i<arr.length ;i++){
                    if(arr[i].equals("(")) {
                        stack.push(arr[i]);
                    }else if(arr[i].equals("{")) {
                        stack.push(arr[i]);
                    }else if(arr[i].equals("[")) {
                        stack.push(arr[i]);
                    }else if(arr[i].equals(")")){
                        if(!stack.pop().equals("(")){
                            result = false;
                            break;
                        }
                    }else if(arr[i].equals("}")){
                        if(!stack.pop().equals("{")){
                            result = false;
                            break;
                        }
                    }else if(arr[i].equals("]")){
                        if(!stack.pop().equals("[")){
                            result = false;
                            break;
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}
