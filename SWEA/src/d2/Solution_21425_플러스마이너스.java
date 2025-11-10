package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_21425_플러스마이너스 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int num = 0;
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			while (A <= N && B <= N) {
				if (A > B) {
					B += A;
				} else A += B;
				
				num++;
			}
			
			result[test_case] = num;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("%d\n", result[test_case]);
		}

		br.close();
	}
}