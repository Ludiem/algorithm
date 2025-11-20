package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1234_비밀번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for (int test_case = 1; test_case <= 10; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			String num = removeDupli(st.nextToken().substring(0, N));
			
			System.out.println("#" + test_case + " " + num);
		}

		br.close();
	}
	
	public static String removeDupli(String num) {
		int dupliNum = -1;
		int dupliNum2 = -1;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num.length() - 1; i++) {
			if (num.charAt(i) == num.charAt(i + 1)) {
				dupliNum = i;
				dupliNum2 = i + 1;
				break;
			}
		}
		
		for (int i = 0; i < num.length(); i++) {
			if (i != dupliNum && i != dupliNum2) sb.append(num.charAt(i));
		}
		
		if (dupliNum == dupliNum2) {
			return sb.toString();
		}
		
		return removeDupli(sb.toString());
	}
}