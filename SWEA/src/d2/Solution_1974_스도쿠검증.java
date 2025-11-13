package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1974_스도쿠검증 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];
		Arrays.fill(result, 1);

		for (int test_case = 0; test_case < T; test_case++) {
			int totalNum = 45;
			int[][] sudoku = new int[9][9];

			for (int i = 0; i < 9; i++) {
				st = new StringTokenizer(br.readLine());

				for (int r = 0; r < 9; r++) {
					sudoku[i][r] = Integer.parseInt(st.nextToken());
				}
			}

			for (int divisionColNum = 3; divisionColNum <= 9 && result[test_case] == 1; divisionColNum += 3) {
				for (int divisionRowNum = 3; divisionRowNum <= 9; divisionRowNum += 3) {
					int num = 0;

					for (int ri = divisionRowNum - 3; ri < divisionRowNum; ri++) {
						for (int ci = divisionColNum - 3; ci < divisionColNum; ci++) {
							num += sudoku[ri][ci];
						}
					}

					if (num != totalNum) {
						result[test_case] = 0;
						break;
					}
				}
			}

			if (result[test_case] == 1) {
				for (int i = 0; i < 9; i++) {
					int num = 0;

					for (int r = 0; r < 9; r++) {
						num += sudoku[i][r];
					}

					if (num != totalNum) {
						result[test_case] = 0;
						break;
					}
				}
			}

			if (result[test_case] == 1) {
				for (int i = 0; i < 9; i++) {
					int num = 0;

					for (int r = 0; r < 9; r++) {
						num += sudoku[r][i];
					}

					if (num != totalNum) {
						result[test_case] = 0;
						break;
					}
				}
			}
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}