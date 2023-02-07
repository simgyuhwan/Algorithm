package com.algorithm.winner.lecture;

import java.util.Scanner;

public class 대소문자변환 {
    public static String solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()) {
            if(x >= 97 && x<= 122) answer+=(char)(x-32);
            else answer += (char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
}
