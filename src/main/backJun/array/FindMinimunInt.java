package backJun.array;

import java.util.Arrays;

public class FindMinimunInt {
    public static void main(String[] args) {

//        N개의 정수로 구성된 배열 A가 주어졌을 때, A에 존재하지 않는 가장 작은 양의 정수(0보다 큰 정수)를 반환합니다.
//
//        예를 들어, A = [1, 3, 6, 4, 1, 2]인 경우 함수는 5를 반환해야 합니다.
//
//                A = [1, 2, 3]인 경우 함수는 4를 반환해야 합니다.
//
//                A = [−1, −3]인 경우 함수는 1을 반환해야 합니다.
//
//                다음 가정에 대한 효율적인 알고리즘을 작성하세요 .
//
//                N은 [ 1 .. 100,000 ] 범위 내의 정수입니다 .
//                배열 A의 각 요소는 [ −1,000,000 .. 1,000,000 ] 범위 내의 정수입니다

        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A)); // 5

        int[] B = {1, 2, 3};
        System.out.println(solution(B)); // 4

        int[] C = {-1, -3};
        System.out.println(solution(C)); // 1


    }

    public static int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int smallest = 1; // 항상 1부터 시작

        for (int i = 0; i < A.length; i++) {
            if (A[i] == smallest) {
                smallest++; // 현재 smallest가 배열에 있으니 그 다음 숫자로
            } else if (A[i] > smallest) {
                // 중간에 건너뛴 숫자가 있으면 그게 최소 양의 정수야
                break;
            }
            // A[i] < smallest 인 경우는 무시 (음수나 중복 포함)
        }

        return smallest;
    }
}
