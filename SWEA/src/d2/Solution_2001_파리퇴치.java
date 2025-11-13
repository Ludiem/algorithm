package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2001_파리퇴치 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[][] flyArray = new int[N][N];
			int[] catchArray = new int[(N - M + 1) * (N - M + 1)];
			int idx = 0;

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());

				for (int r = 0; r < N; r++) {
					flyArray[i][r] = Integer.parseInt(st.nextToken());
				}
			}

			for (int colNum = 0; colNum < N - M + 1; colNum++) {
				for (int rowNum = 0; rowNum < N - M + 1; rowNum++) {
					int totalCatchFly = 0;
					
					for (int i = 0; i < M; i++) {
						for (int r = 0; r < M; r++) {
							totalCatchFly += flyArray[rowNum + i][colNum + r];
						}
					}
					
					catchArray[idx] = totalCatchFly;
					idx++;
				}
			}

			Arrays.sort(catchArray);

			result[test_case] = catchArray[catchArray.length - 1];
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}