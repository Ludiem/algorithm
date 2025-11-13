package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1954_달팽이숫자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			
			int N = Integer.parseInt(br.readLine());
			int rowNum = 0;
			int colNum = 0;
			
			int[][] snailArray = new int[N][N];
			
			for (int i = 1; i <= N * N; i++) {
				snailArray[rowNum][colNum] = i;
				
				if (rowNum == 0) {
					if (colNum < N) {
						colNum++;
						
						if (colNum == N) {
							colNum--;
							rowNum++;
						}
					} 
				} else if (rowNum > 0 && rowNum < N - 1) {
					if (colNum == N - 1) {
						if (rowNum < N) {
							rowNum++;
							
							if (rowNum == N) {
								rowNum--;
								colNum--;
							}
						}
					} else if (colNum == 0) {
						if (snailArray[rowNum - 1][colNum] == 0) {
							rowNum--;
						} else {
							colNum++;
						}
					} else if (colNum > 0 && colNum < N - 1) {
						if (snailArray[rowNum][colNum + 1] == 0 && snailArray[rowNum + 1][colNum] == 0) {
							colNum++;
						} else if (snailArray[rowNum + 1][colNum] == 0 && snailArray[rowNum][colNum + 1] != 0) {
							rowNum++;
						} else if (snailArray[rowNum][colNum - 1] == 0 && snailArray[rowNum + 1][colNum] != 0) {
							colNum--;
						} else if (snailArray[rowNum - 1][colNum] == 0 && snailArray[rowNum][colNum - 1] != 0) {
							rowNum--;
						} else if (snailArray[rowNum][colNum + 1] == 0 && snailArray[rowNum - 1][colNum] != 0) {
							colNum++;
						}
					}
				} else {
					if (colNum > -1) {
						colNum--;
						
						if (colNum == -1) {
							colNum++;
							rowNum--;
						}
					}
				}
			}
			
			sb.append("\n");
			
			for (int i = 0; i < N; i++) {
				for (int r = 0; r < N; r++) {
					sb.append(snailArray[i][r] + " ");
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