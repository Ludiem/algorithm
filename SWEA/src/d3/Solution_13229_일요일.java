package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_13229_일요일 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];
		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

		for (int test_case = 0; test_case < T; test_case++) {
			String S = br.readLine();
			int weekIdx = 0;
			
			for (int i = 0; i < week.length; i++) {
				if (S.equals(week[i])) {
					weekIdx = i;
					break;
				}
			}
			
			if (6 - weekIdx == 0) {
				result[test_case] = 7;
			} else result[test_case] = 6 - weekIdx;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}