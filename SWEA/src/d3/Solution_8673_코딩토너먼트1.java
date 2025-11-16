package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_8673_코딩토너먼트1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			int K = Integer.parseInt(br.readLine());
			int participant = (int) Math.pow(2, K);
			st = new StringTokenizer(br.readLine());
			int boredom = 0;
			
			int[] A = new int[participant];
			
			for (int i = 0; i < participant; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			while (participant > 1) {
				for (int i = 0; i < participant; i += 2) {
					if (A[i] >= A[i + 1]) {
						boredom += A[i] - A[i + 1];
						A[i + 1] = 0;
					} else {
						boredom += A[i + 1] - A[i];
						A[i] = A[i + 1];
						A[i + 1] = 0;
					}
					
					if (i > 0) {
						A[i / 2] = A[i];
						A[i] = 0;
					}
				}
				
				participant = participant / 2;
			}
			
			result[test_case] = boredom;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}