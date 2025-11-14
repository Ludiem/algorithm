package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6730_장애물경주난이도 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[][] result = new int[T][2];

		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());

			int[] height = new int[N];
			int up = 0;
			int down = 0;

			for (int i = 0; i < N; i++) {
				height[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < N - 1; i++) {
				int temp = 0;
				
				if (height[i] < height[i + 1]) {
					temp = height[i + 1] - height[i];
					
					if (up < temp) {
						up = temp;
					}
				} else {
					temp = height[i] - height[i + 1];
					
					if (down < temp) {
						down = temp;
					}
				}
			}
			
			result[test_case][0] = up;
			result[test_case][1] = down;
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d %d\n", test_case + 1, result[test_case][0], result[test_case][1]);
		}

		br.close();
	}
}