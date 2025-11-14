package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11688_CalkinWilftree1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[][] result = new int[T][2];

		for (int test_case = 0; test_case < T; test_case++) {
			int a = 1;
			int b = 1;
			
			char[] direction = br.readLine().toCharArray();
			
			for (int i = 0; i < direction.length; i++) {
				if (direction[i] == 'L') {
					b = a + b;
				} else {
					a = a + b;
				}
			}
			
			result[test_case][0] = a;
			result[test_case][1] = b;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d %d\n", test_case + 1, result[test_case][0], result[test_case][1]);
		}

		br.close();
	}
}