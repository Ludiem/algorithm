package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_14692_통나무자르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		String[] result = new String[TC];

		for (int test_case = 0; test_case < TC; test_case++) {
			String N = br.readLine();
			result[test_case] = Integer.parseInt(N.substring(N.length() - 1)) % 2 == 0 ? "Alice" : "Bob";
		}
		
		for (int test_case = 0; test_case < TC; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}