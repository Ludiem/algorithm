package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1240_단순2진암호코드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			char[][] cord = new char[N][M];
			int startRow = 0;
			int endIdx = 0;
			int result = 0;
			String[] checkCord = {"0001101", "0011001", "0010011", "0111101", "0100011", "0110001", "0101111", "0111011", "0110111", "0001011"};
			
			for (int i = 0; i < N; i++) {
				cord[i] = br.readLine().toCharArray();
			}
			
			for (int i = 0; i < N && endIdx == 0; i++) {
				for (int r = M - 1; r >= 0; r--) {
					if (cord[i][r] - '0' == 1) {
						endIdx = r;
						startRow = i;
						break;
					}
				}
			}
				
			for (int i = endIdx - 55; i < endIdx; i += 7) {
				for (int r = i; r < i + 7; r++) {
					sb.append(cord[startRow][r]);
				}
				
				sb.append("/");
			}
			
			String[] splitPassword = sb.toString().split("/");
			int oddNum = 0;
			int evenNum = 0;
			
			for (int i = 0; i < splitPassword.length; i++) {
				int check = -1;
				
				for (int r = 0; r < checkCord.length; r++) {
					if (splitPassword[i].equals(checkCord[r])) {
						check = r;
						
						if (i % 2 == 0) {
							oddNum += r;
						} else evenNum += r;
					}
				}
				
				if (check == -1) {
					oddNum = 0;
					evenNum = 0;
					break;
				}
			}
			
			
			if (oddNum != 0 && evenNum != 0) {
				if ((oddNum * 3 + evenNum) % 10 == 0) {
					result = oddNum + evenNum;
				} else {
					result = 0;
				}
				
			}
			
			System.out.println("#" + test_case + " " + result);
		}
		
		br.close();
	}
}