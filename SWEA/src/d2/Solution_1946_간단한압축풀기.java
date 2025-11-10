package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1946_간단한압축풀기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			int N = Integer.parseInt(br.readLine());
			
			String[] alphabet = new String[N];
			int[] reps = new int[N];
			
			int currentNum = 1;
			int maxNum = 0;
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				
				alphabet[i] = st.nextToken();
				reps[i] = Integer.parseInt(st.nextToken());
				maxNum += reps[i];
			}
			
			while (currentNum <= maxNum) {
				for (int i = 0; i < N; i++) {
					for (int reps_num = 0; reps_num < reps[i]; reps_num++) {
						sb.append(alphabet[i]);
						
						if (currentNum % 10 == 0) {
							sb.append("\n");
						}
						
						currentNum++;
					}
				}
				
				result[test_case] = sb.toString();
			}
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d\n%s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}