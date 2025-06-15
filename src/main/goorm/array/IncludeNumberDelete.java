package goorm.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IncludeNumberDelete {
    public static void main(String[] args) throws Exception {

        // 문제: N개의 정수가 주어질 때,
        //       각 수에 숫자 K가 포함되어 있다면 배열에 넣지 않고,
        //       포함되어 있지 않은 수만 배열에 넣을 수 있음.
        //       최종적으로 배열에 들어갈 수 있는 정수의 개수를 구하는 문제

        // 입력:
        // 첫 줄에 N과 K가 주어짐 (정수의 개수 N, 제거 조건 숫자 K)
        // 둘째 줄에 N개의 정수 a1, a2, ..., aN이 공백으로 주어짐

        // 조건:
        // 1 <= N <= 100,000
        // 1 <= K < 100
        // 1 <= ai <= 200,000

        // 처리:
        // - 각 ai를 문자열로 변환 후
        // - 문자열에 K가 포함되어 있는지 검사
        // - 포함되어 있지 않은 경우에만 count 증가

        // 출력:
        // - 배열에 들어갈 수 있는 정수의 개수를 출력

        // 예시 입력:
        // 5 2
        // 10 20 22 12 11

        // 예시 출력:
        // 2 (10과 11만 K=2를 포함하지 않음)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        String[] flag = N.split(" ");

        String K = br.readLine();
        String[] saveNumber = K.split(" ");
        int count = 0;
        for(int i=0; i<saveNumber.length;i++){
            String compareStr = flag[1];
            if(!saveNumber[i].contains(compareStr)){
                count++;
            }
        }

        System.out.println(count);

    }
}
