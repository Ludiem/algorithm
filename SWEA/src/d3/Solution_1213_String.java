package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1213_String {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] result = new int[11];

		for (int test_case = 0; test_case < 10; test_case++) {
			int TC = Integer.parseInt(br.readLine());
			String find = br.readLine();
			String word = br.readLine();
			
			result[TC] = word.length() - word.replace(find, "").length();
			result[TC] = result[TC] / find.length();
		}

		for (int test_case = 1; test_case <= 10; test_case++) {
			System.out.printf("#%d %d\n", test_case, result[test_case]);
		}

		br.close();
	}
}