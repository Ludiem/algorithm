package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1984_중간평균값구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			
			int min = 0;
			int max = 0;
			int total = 0;
			
			for (int i = 0; i < 10; i++) {
				int num = Integer.parseInt(st.nextToken());
				
				if (i == 0) {
					min = num;
					max = num;
				} else {
					if (min > num) min = num;
					if (max < num) max = num;
				}
				
				total += num;
			}
			
			result[test_case] = String.format("%.0f", (total - min - max) / 8.0);
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}