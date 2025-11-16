package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_7102_준홍이의카드놀이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[] cardNum = new int[N + M + 1];
			int max = 0;
			
			for (int i = 1; i <= N; i++) {
				for (int r = 1; r <= M; r++) {
					cardNum[i + r]++;
				}
			}
			
			for (int i = 2; i <= N + M; i++) {
				if (cardNum[i] > max) max = cardNum[i];
			}
			
			for (int i = 2; i <= N + M; i++) {
				if (cardNum[i] == max) {
					sb.append(i + " ");
				}
			}
			
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}