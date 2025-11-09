package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1976_시각덧셈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int timeNum = 2;
		int[][] result = new int[T][timeNum];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int hour = 0;
			int minute = 0;
			
			for (int timeIdx = 0; timeIdx < timeNum; timeIdx++) {
				hour += Integer.parseInt(st.nextToken());
				minute += Integer.parseInt(st.nextToken());
			}
			
			if (minute >= 60) {
				hour++;
				minute = minute - 60;
			}
			
			if (hour > 12) {
				hour = hour - 12;
			}
			
			result[test_case][0] = hour;
			result[test_case][1] = minute;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d %d\n", test_case + 1, result[test_case][0], result[test_case][1]);
		}

		br.close();
	}
}