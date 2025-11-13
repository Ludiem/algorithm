package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2005_파스칼의삼각형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			
			int N = Integer.parseInt(br.readLine());
			int[][] pascalArray = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				pascalArray[i][0] = 1;
				pascalArray[i][i] = 1;
			}
			
			if (N > 2) {
				for (int i = 1; i < N - 1; i++) {
					for (int r = 0; r < i; r++) {
						pascalArray[i + 1][r + 1] = pascalArray[i][r] + pascalArray[i][r + 1];
					}
				}
			}
			
			sb.append("\n");
			
			for (int i = 0; i < N; i++) {
				for (int r = 0; r < i + 1; r++) {
					sb.append(pascalArray[i][r]);
					sb.append(" ");
				}
				
				sb.append("\n");
			}
			
			result[test_case] = sb.toString();
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s", test_case + 1, result[test_case]);
		}

		br.close();
	}
}