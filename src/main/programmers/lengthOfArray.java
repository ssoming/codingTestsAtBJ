package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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
