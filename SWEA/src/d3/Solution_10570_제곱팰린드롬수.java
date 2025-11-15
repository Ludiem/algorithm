package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_10570_제곱팰린드롬수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int total = 0;
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			for (int i = A; i <= B; i++) {
				sb = new StringBuilder();
				int sqrt = 0;
				
				if (Math.sqrt(i) % 1 != 0) {
					continue;
				} else sqrt = (int) Math.sqrt(i);
				
				sb.append(i);
				String num = sb.toString();
				String reverseNum = sb.reverse().toString();
				
				if (!num.equals(reverseNum)) continue;
				
				sb.setLength(0);
				sb.append(sqrt);
				String numSqrt = sb.toString();
				String reverseSqrt = sb.reverse().toString();
				
				if (!numSqrt.equals(reverseSqrt)) continue;
				
				total++;
			}
			
			result[test_case] = total;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}