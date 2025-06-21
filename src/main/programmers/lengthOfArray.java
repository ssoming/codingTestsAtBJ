package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
//
//제한사항
//2 ≤ num_list의 길이 ≤ 20
//        1 ≤ num_list의 원소 ≤ 9
//num_list의 원소를 모두 곱했을 때 2,147,483,647를 넘는 입력은 주어지지 않습니다.
//        입출력 예
//num_list	result
//[3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1]	51
//        [2, 3, 4, 5]	120
//입출력 예 설명
//입출력 예 #1
//
//리스트의 길이가 13이므로 모든 원소의 합인 51을 return합니다.
//입출력 예 #2
//
//리스트의 길이가 4이므로 모든 원소의 곱인 120을 return합니다.


public class lengthOfArray {
    //3,4,5,2,5,4,6,7,3,7,2,2,1
    public  static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] array = Arrays.stream(input.split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int answer = array[0];
        boolean isLong = false;
        int sum = 0;
        System.out.println("array.length : " + array.length);
        if(array.length <11) isLong = true;
        System.out.println("isLong : " + isLong);
        for(int i =0; i < array.length; i++ ){
            System.out.println("array[i] : " + array[i]);
            if(isLong && i >0) {
                answer = answer * array[i];
                System.out.println(answer);
            }else if(i >0){
                answer =answer + array[i];
                System.out.println("answer : " + answer);
            }
        }
        System.out.println(answer);
    }
}
