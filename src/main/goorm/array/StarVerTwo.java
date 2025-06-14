package goorm.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StarVerTwo {
    public static void main(String[] args) {

        //별찍기 (2)
        /*
        문제: 별 찍기 (2)

        입력:
        - 첫째 줄에 정수 N이 주어진다. (1 ≤ N ≤ 100)

        출력:
        - 총 N줄 출력
        - 1번째 줄에는 별 N개
        - 2번째 줄에는 별 N-1개
        ...
        - N번째 줄에는 별 1개

        예시 입력:
        5

        예시 출력:
        *****
        ****
        ***
        **
        *
        */

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int totalIndex = Integer.parseInt(input);
        System.out.println(totalIndex);

        StringBuilder sb = new StringBuilder();
        for(int j=0; j< totalIndex ; j++){
            sb.append("*");
        }
        for(int i = totalIndex; i>0; i--){
            if(i ==  totalIndex){
                System.out.println(sb.toString());
                continue;
            }
            sb.deleteCharAt(i);
            System.out.println(sb.toString());

        }

    }
}
