package com.cm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-comparator/problem
 */
public class JavaComparator {

    class Checker implements Comparator<Player>{
        @Override
        public int compare(Player o1, Player o2) {
            if(o1.score > o2.score){
                return  -1; // 내림차순
            }else if(o1.score < o2.score){
                return 1;
            }else if (o1.score == o2.score){ // 알파벳순
                return o1.name.compareTo(o2.name);
            }
            return 0;
        }

    }

    class Player{
        String name;
        int score;

        Player(String name, int score){
            this.name = name;
            this.score = score;
        }
    }

    public JavaComparator() {
        solution();
    }

    public void solution(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);

        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }

} //CLASS END
