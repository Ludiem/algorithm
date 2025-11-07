package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] puzzle = new int[N][N];

			for (int col = 0; col < N; col++) {
				st = new StringTokenizer(br.readLine());

				for (int row = 0; row < N; row++) {
					puzzle[col][row] = Integer.parseInt(st.nextToken());
				}
			}

			for (int col = 0; col < N; col++) {
				int num = 0;

				for (int row = 0; row < N; row++) {
					if (puzzle[col][row] == 0) {
						if (num == K) {
							result[test_case]++;
						}

						num = 0;

					} else {
						num++;
					}
				}

				if (num == K) {
					result[test_case]++;
				}
			}

			for (int row = 0; row < N; row++) {
				int num = 0;

				for (int col = 0; col < N; col++) {
					if (puzzle[col][row] == 0) {
						if (num == K) {
							result[test_case]++;
						}

						num = 0;

					} else {
						num++;
					}
				}

				if (num == K) {
					result[test_case]++;
				}
			}
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}
