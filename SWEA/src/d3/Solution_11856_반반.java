package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_11856_반반 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= TC; test_case++) {
			char[] S = br.readLine().toCharArray();
			String result = null;
			
			char firstWord = S[0];
			char secondWord = '0';
			int num = 1;
			int num2 = 0;
			
			for (int i = 1; i < S.length; i++) {
				if (firstWord != S[i]) {
					if (secondWord == '0') {
						secondWord = S[i];
						num2++;
						continue;
					}
				} else num++;
				
				if (secondWord != '0') {
					if (secondWord == S[i]) {
						num2++;
					}
				}
			}
			
			result = num == 2 && num2 == 2 ? "Yes" : "No";
			
			System.out.println("#" + test_case + " " + result);
		}

		br.close();
	}
}