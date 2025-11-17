package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2805_농작물수확하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			char[][] farm = new char[N][N];
			int total = 0;
			
			for (int i = 0; i < N; i++) {
				farm[i] = br.readLine().toCharArray();
			}
			
			 for (int i = 0; i < N / 2 + 1; i++) {
				 for (int r = N / 2 - i; r <= N / 2 + i; r++) {
					 total += farm[i][r] - 48;
				 }
			 }
			 
			 for (int i = N / 2 + 1; i < N; i++) {
				 for (int r = N / 2 - (N - i - 1); r <= N / 2 + (N - i - 1); r++) {
					 total += farm[i][r] - 48;
				 }
			 }
			 
			 result[test_case] = total;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}