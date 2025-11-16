package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_8658_Summation {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int[] num = new int[10];
			
			for (int i = 0; i < 10; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				
				int sum = 0;
				while (num[i] != 0) {
					sum += num[i] % 10;
					num[i] = num[i] / 10;
				}
				
				num[i] = sum;
			}
			
			Arrays.sort(num);
			
			sb.append(num[9] + " " + num[0]);
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}