package realTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class PulseArray3 {

	//연속 펄스 부분수열
	//	원래 수열:    [1, 3, -2, 4, -1]
	//	펄스 패턴 1:  [1, -1, 1, -1, 1]
	//	펄스 패턴 2:  [-1, 1, -1, 1, -1]
	// 각 펄스를 곱한 배열의 합 최댓값

	//	예
	//	[2,3,-6,1,3,-1,2,4]
	//
	//	합의 최대값 10

	//	문제 설명
	//	어떤 수열의 연속 부분 수열에 같은 길이의 펄스 수열을 각 원소끼리 곱하여 연속 펄스 부분 수열을 만들려 합니다.
	//	펄스 수열이란 [1, -1, 1, -1 …] 또는 [-1, 1, -1, 1 …]과 같이 1 또는 -1로 시작하면서 1과 -1이 번갈아 나오는 수열입니다.
	//	예를 들어 수열 [2, 3, -6, 1, 3, -1, 2, 4]의 연속 부분 수열 [3, -6, 1]에 펄스 수열 [1, -1, 1]을 곱하면 연속 펄스 부분수열은 [3, 6, 1]이 됩니다.
	//	또 다른 예시로 연속 부분 수열 [3, -1, 2, 4]에 펄스 수열 [-1, 1, -1, 1]을 곱하면 연속 펄스 부분수열은 [-3, -1, -2, 4]이 됩니다.
	//	정수 수열 sequence가 매개변수로 주어질 때, 연속 펄스 부분 수열의 합 중 가장 큰 것을 return 하도록 solution 함수를 완성해 주세요.
	//
	//	입출력 예 설명
	//	주어진 수열의 수열 [2, 3, -6, 1, 3, -1, 2, 4] 중에 연속 부분 수열 [3, -6, 1]에 펄스 수열 [1, -1, 1]을 곱하여 연속 펄스 부분 수열 [3, 6, 1]을 얻을 수 있고 그 합은 10으로서 가장 큽니다.




	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int[] inputArray = Arrays.stream(input.split(","))
					.mapToInt(Integer::parseInt)
					.toArray();

		int[] pulse1 = new int[inputArray.length];
		int[] pulse2 = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			if( i %2 == 0 ){
				pulse1[i] = 1;
				pulse2[i] = -1;
			}else{
				pulse1[i] = -1;
				pulse2[i] = 1;
			}

			pulse1[i] = inputArray[i] * pulse1[i];
			pulse2[i] = inputArray[i] * pulse2[i];
		}

		int max1Sum = solution(pulse1);
		int max2Sum = solution(pulse2);
//		System.out.println("max1Sum : " + max1Sum);
//		System.out.println("max2Sum : " + max2Sum);

		System.out.println(max1Sum > max2Sum ? max1Sum : max2Sum);
	}
	public static int solution(int[] array) {
		int maxSum = array[0];
		int pulseSum = 0;

		for (int i = 0; i < array.length; i++) {
			int compareInt = array[i] + pulseSum;
//			System.out.println("compareInt : " + compareInt + " / array[i] : " + array[i]);
			pulseSum = compareInt > array[i] ? compareInt : array[i];
			maxSum = pulseSum > maxSum ? pulseSum : maxSum;
//			System.out.println("pulseSum : " + pulseSum);
//			System.out.println("maxSum : " + maxSum);
		}

		return maxSum;
	}
}