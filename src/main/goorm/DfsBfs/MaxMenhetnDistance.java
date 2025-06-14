package goorm.DfsBfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMenhetnDistance {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens = input.split(" ");
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        Arrays.sort(arr);

        // 가능한 세 가지 조합의 맨해튼 거리 계산
        int d1 = Math.abs(arr[0] - arr[2]) + Math.abs(arr[1] - arr[3]);
        int d2 = Math.abs(arr[0] - arr[1]) + Math.abs(arr[2] - arr[3]);
        int d3 = Math.abs(arr[0] - arr[3]) + Math.abs(arr[1] - arr[2]);

        int answer = Math.max(d1, Math.max(d2, d3));
        System.out.println(answer);

    }
}
