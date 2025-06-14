package backJun.example;

import java.util.Scanner;

public class NumberSummary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N < 1 || N > 100) {
            System.out.println("범위 (1 ≤ N ≤ 100)");
            return;
        }
        String nums = scan.next();
        if (nums.length() != N) {
            System.out.println("입력된 숫자가 N개 아님");
            return;
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (Character.isDigit(nums.charAt(i))) {
                sum += Character.getNumericValue(nums.charAt(i));
            } else {
                System.out.println("숫자가 아님");
                return;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
