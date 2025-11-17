package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9997_미니멀리즘시계 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[][] result = new int[T][2];

		for (int test_case = 0; test_case < T; test_case++) {
			int angle = Integer.parseInt(br.readLine()) * 2;
			
			result[test_case][0] = angle / 60 == 12 ? 0 : angle / 60;
			result[test_case][1] = angle % 60;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d %d\n", test_case + 1, result[test_case][0], result[test_case][1]);
		}

		br.close();
	}
}