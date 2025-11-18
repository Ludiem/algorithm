package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1209_Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] result = new int[10];

		for (int test_case = 0; test_case < 10; test_case++) {
			int TC = Integer.parseInt(br.readLine());
			int[][] arraySum = new int[100][100];

			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				for (int r = 0; r < 100; r++) {
					arraySum[i][r] = Integer.parseInt(st.nextToken());
				}
			}

			int maxSum = 0;
			int diagonal = 0;
			int diagonal2 = 0;

			for (int i = 0; i < 100; i++) {
				int row = 0;
				int col = 0;

				for (int r = 0; r < 100; r++) {
					row += arraySum[i][r];
					col += arraySum[r][i];
				}

				maxSum = row > col ? maxSum > row ? maxSum : row 
									: maxSum > col ? maxSum : col;

				diagonal += arraySum[i][i];
				diagonal2 += arraySum[i][99 - i];
			}
			
			maxSum = diagonal > diagonal2 ? maxSum > diagonal ? maxSum : diagonal 
											: maxSum > diagonal2 ? maxSum : diagonal2;
											
			result[test_case] = maxSum;
		}

		for (int test_case = 0; test_case < 10; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}