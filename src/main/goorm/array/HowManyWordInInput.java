package goorm.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HowManyWordInInput {
    public static void main(String[] args) throws Exception {

        /*
        문제: 단어의 개수 세기

        설명:
        - 알파벳 대소문자와 공백으로 이루어진 문자열이 주어진다.
        - 이 문자열에서 단어의 개수를 출력한다.

        조건:
        - 단어는 하나 이상의 알파벳으로 이루어진 부분 문자열을 의미한다.
        - 단어는 공백으로 구분된다.
        - 문자열 앞뒤에 공백이 있을 수 있으며, 이 공백은 단어로 세지 않는다.
        - 단어 사이에는 하나 이상의 공백이 있을 수 있다.
        - 문자열의 길이는 1 이상 1,000 이하이다.

        입력:
        - 한 줄짜리 문자열 S

        출력:
        - 공백을 기준으로 나누어진 실제 단어의 개수

        예시:
        입력 → "Goorm    Edu"
        출력 → 2
        */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] strSplitArray = input.split(" ");
        int count = 0;

        // System.out.println(strSplitArray.length);
        for(int i=0; i < strSplitArray.length; i++){
            // System.out.println(strSplitArray[i]);
            if(!strSplitArray[i].isEmpty()){
                count++;
            }
        }

        System.out.println(count);
    }
}
