package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2068_최대수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		int[] maxNum = new int[T];
		
		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int[] numArray = new int[10];
			
			for (int n = 0; n < 10; n++) {
				numArray[n] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(numArray);
			maxNum[test_case] = numArray[9];
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, maxNum[test_case]);
		}

		br.close();
	}
}