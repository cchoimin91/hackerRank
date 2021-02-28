package com.cm;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/prime-checker/problem
 *
 *  자바 리플렉션(Reflection)이란 컴파일된 자바 코드에서 역으로 클래스를 불러서 메소드(Method) 및 변수(Field)를 구해오는 방법으로
 * 클래스를 동적 로딩하여 사용할때 많이 사용되고 디컴파일할때에도 자주 사용되는 기법이다.
 *
 */
public class PrimeChecker {

    class Prime{

        public void checkPrime(int... n1) {
            for(int n : n1){
                if (isPrime(n)){
                    System.out.print(n+" ");
                }
            }
            System.out.println("");
        }

        public boolean isPrime(int n){
            boolean prime = true;

            if(n<2){
                return false;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0) { // 나누어 나머지 값이 떨어지면 소수 아님
                    prime = false;
                    break;
                }
            }
            return prime;
        }
    }

    public PrimeChecker() {
        solution();
    }

    public void solution(){
        try{
            InputStream in = System.in;
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            int n1=Integer.parseInt(br.readLine());
            int n2=Integer.parseInt(br.readLine());
            int n3=Integer.parseInt(br.readLine());
            int n4=Integer.parseInt(br.readLine());
            int n5=Integer.parseInt(br.readLine());

            Prime ob=new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1,n2);
            ob.checkPrime(n1,n2,n3);
            ob.checkPrime(n1,n2,n3,n4,n5);

            Method[] methods=Prime.class.getDeclaredMethods();
            Set<String> set=new HashSet<>();
            boolean overload=false;

            for(int i=0;i<methods.length;i++)
            {
                if(set.contains(methods[i].getName()))
                {
                    overload=true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if(overload)
            {
                throw new Exception("Overloading not allowed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
