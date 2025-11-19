package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_6692_다솔이의월급상자 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			double result = 0.0;
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				
				double p = Double.parseDouble(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				
				result += p * x;
			}
			
			System.out.printf("#%d %6f\n", test_case, result);
		}

		br.close();
	}
}