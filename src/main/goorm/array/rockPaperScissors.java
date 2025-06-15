package goorm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rockPaperScissors {
    public static void main(String[] args) throws IOException {

        // 문제: 다섯 명의 참가자 A, B, C, D, E가 가위바위보를 한 번에 동시에 낼 때
        //       이긴 사람이 몇 명인지 출력하는 프로그램

        // 규칙:
        // - 각 사람은 한 번에 가위(1), 바위(2), 보(3) 중 하나를 낼 수 있음
        // - 승부 규칙:
        //     가위(1) > 보(3)
        //     바위(2) > 가위(1)
        //     보(3) > 바위(2)

        // - 모두가 같은 것을 내거나, 모든 선택이 섞여 있으면 무승부 (이긴 사람 없음)

        // 입력:
        // - 한 줄에 다섯 개의 정수 A B C D E가 공백으로 주어짐
        // - 각 값은 1(가위), 2(바위), 3(보) 중 하나

        // 출력:
        // - 가위바위보를 수행한 결과, 이긴 사람 수 출력

        // 예시 입력:
        // 1 1 3 3 1

        // 예시 출력:
        // 3 (가위 1명 vs 보 2명 → 가위가 이김)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String whatsResponse = br.readLine();
        String[] rs = whatsResponse.split(" ");
        // String[] allowRs = ["가위","바위","보"];

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i = 0; i <rs.length; i++){
            if(rs[i].equals("1")){
                cnt1++;
                continue;
            }else if(rs[i].equals("2")){
                cnt2++;
                continue;
            }else if(rs[i].equals("3")){
                cnt3++;
                continue;
            }
        }

        if(cnt1 > 0 && cnt2 > 0 && cnt3 > 0){
            System.out.println("0");
        }else if(cnt1 > 0 && cnt2 == 0 && cnt3 == 0){
            System.out.println("0");
        }else if(cnt1 == 0 && cnt2 > 0 && cnt3 == 0){
            System.out.println("0");
        }else if(cnt1 == 0 && cnt2 == 0 && cnt3 > 0){
            System.out.println("0");
        }else if(cnt1 > 0 && cnt2 > 0){
            System.out.println(cnt2);
        }else if(cnt1 > 0 && cnt3 > 0){
            System.out.println(cnt1);
        }else if(cnt2 > 0 && cnt3 > 0){
            System.out.println(cnt3);
        }
    }
}
