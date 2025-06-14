package goorm.array;

import java.util.Scanner;

public class ExchangeUpperLower {
    public static void main(String[] args){

        //  대소문자 바꾸기
        /*
        문제 설명:
        - 길이 N인 영문자로 이루어진 문자열 S가 주어진다.
        - 각 문자를 대문자 <-> 소문자로 바꿔서 출력하라.

        입력:
        - 첫째 줄: 정수 N (1 ≤ N ≤ 10,000)
        - 둘째 줄: 길이 N인 문자열 S (알파벳 대/소문자로만 구성됨)

        출력:
        - 바뀐 문자열을 한 줄로 출력한다.

        예제 입력:
        10
        goormLevel

        예제 출력:
        GOORMlEVEL
        */

        Scanner sc = new Scanner(System.in);
        int strSize = sc.nextInt();
        sc.nextLine();
        String input = sc.next();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strSize;i++){
            char ch = input.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
                sb.append(Character.toString(ch));
            }else{
                ch = Character.toUpperCase(ch);
                sb.append(Character.toString(ch));
            }
        }
        System.out.println(sb);



    }
}
