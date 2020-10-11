package com.cm;

import java.math.BigInteger;
import java.util.Scanner;

public class Primality {

    public Primality() {
        solution2();
    }

    /**
     * 특정케이스 error 및 timeout발생
     */
    public void solution1() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // 34263233064835421125264776608163440537925705997962346596977803462033841059628723
        // 4901971054862853523
        long inputNum = Long.parseLong(input);

        int divide = 2;

        boolean result = true;
        while (divide < inputNum) {
            if (inputNum % divide == 0) {
                result = false; // 소수가 아님.
                break;
            }
            divide++;
        }

        if (result){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }

    public void solution2(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        BigInteger inputNum = new BigInteger(input);

        //BigInteger객체가 소수일 확률은 1-1/2^certainty (확률화 알고리즘)
        System.out.println(inputNum.isProbablePrime(1)?"prime":"not prime");
    }
}
