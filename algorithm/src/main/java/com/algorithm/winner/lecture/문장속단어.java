package com.algorithm.winner.lecture;

import java.util.Scanner;

/**
 * 문장속단어.java
 * Class 설명을 작성하세요.
 *
 * @author sgh
 * @since 2023.02.09
 */
public class 문장속단어 {

    public static String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > max) {
                max = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextLine()));
    }
}
