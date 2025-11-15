package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_7728_다양성측정 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			char[] X = br.readLine().toCharArray();
			int[] range = new int[10];
			int total = 0;
			
			for (int i = 0; i < X.length; i++) {
				range[X[i] - '0']++;
			}
			
			for (int i = 0; i < 10; i++) {
				if (range[i] > 0) total++;
			}
			
			result[test_case] = total;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}