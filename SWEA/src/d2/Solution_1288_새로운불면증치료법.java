package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1288_새로운불면증치료법 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			boolean[] checkSheep = new boolean[10];
			Arrays.fill(checkSheep, false);
			boolean trueCheck = false;

			for (int multiply = 1; !trueCheck; multiply++) {
				int temp = N * multiply;
				result[test_case]++;

				while (temp > 0) {
					if (!checkSheep[temp % 10])
						checkSheep[temp % 10] = true;
					temp = temp / 10;
				}
				
				trueCheck = true;
				for (boolean check : checkSheep) {
					if (!check) {
						trueCheck = false;
						break;
					}
				}
			}
			
			result[test_case] = result[test_case] * N;
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}