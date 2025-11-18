package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_9700_USB꽂기의미스터리 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int TC = Integer.parseInt(br.readLine());
		String[] result = new String[TC];

		for (int test_case = 0; test_case < TC; test_case++) {
			st = new StringTokenizer(br.readLine());
			float p = Float.parseFloat(st.nextToken());
			float q = Float.parseFloat(st.nextToken());
			
			float s = (1 - p) * q;
			float s2 = p * (1 - q) * q;
			
			if (s > s2) {
				result[test_case] = "NO";
			} else result[test_case] = "YES";
		}

		for (int test_case = 0; test_case < TC; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}