package goorm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class aPlusBInteger {
    public static void main(String[] args) throws IOException {

        // 문제: 두 정수 A와 B를 입력받아 합을 출력하는 프로그램
        // 입력: 한 줄에 정수 A, B가 공백으로 구분되어 주어짐
        //     (조건: -10^6 ≤ A, B ≤ 10^6)
        // 출력: A와 B의 합을 출력
        // 예시 입력: 5 3
        // 예시 출력: 8

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String[] intArray = input.split(" ");

        int a = Integer.parseInt(intArray[0]);
        int b = Integer.parseInt(intArray[1]);

        System.out.println(a+b);


    }
}
