package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10505_소득불균형 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			int[] earnings = new int[N];
			int total = 0;
			int average = 0;
			int belowAverage = 0;
			
			for (int i = 0; i < N; i++) {
				earnings[i] = Integer.parseInt(st.nextToken());
				total += earnings[i];
			}
			
			average = total / N;
			
			for (int i = 0; i < N; i++) {
				if (earnings[i] <= average) {
					belowAverage++;
				}
			}
			
			result[test_case] = belowAverage;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}