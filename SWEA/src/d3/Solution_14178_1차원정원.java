package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_14178_1차원정원 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());
			
			int[] flower = new int[N + 1];
			int total = 0;
			
			for (int i = D + 1; i <= N - D; i += 2 * D + 1) {
				flower[i - D]++;
				flower[i + D]++;
				total++;
			}
			
			if (flower[flower.length - 1] == 0) total++;
			
			System.out.println("#" + test_case + " " + total);
		}

		br.close();
	}
}