package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1225_암호생성기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		
		String[] result = new String[11];

		for (int test_case = 0; test_case < 10; test_case++) {
			sb = new StringBuilder();
			int TC = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] num = new int[8];
			
			for (int i = 0; i < 8; i++) {
				num[i] = Integer.parseInt(st.nextToken());
			}
			
			while (num[7] != 0) {
				int temp = 0;
				
				for (int i = 1; i <= 5; i++) {
					if (num[0] - i < 0) {
						temp = 0;
					} else temp = num[0] - i;
					
					for (int r = 0; r < 7; r++) {
						num[r] = num[r+1];
					}
					
					num[7] = temp;
					
					if(num[7] == 0) break;
				}
			}
			
			for (int i = 0; i < 8; i++) {
				sb.append(num[i] + " ");
			}
			
			result[TC] = sb.toString();
		}
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			System.out.printf("#%d %s\n", test_case, result[test_case]);
		}

		br.close();
	}
}