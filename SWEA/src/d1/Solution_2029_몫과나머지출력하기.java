package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_2029_몫과나머지출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[3];
		
		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a/b);
			sb.append(" ");
			sb.append(a%b);
			
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}
	}
}