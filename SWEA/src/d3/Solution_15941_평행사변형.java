package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_15941_평행사변형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());
		int[] result = new int[TC];

		for (int test_case = 0; test_case < TC; test_case++) {
			int N = Integer.parseInt(br.readLine());
			
			result[test_case] = N * N;
		}
		
		for (int test_case = 0; test_case < TC; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}