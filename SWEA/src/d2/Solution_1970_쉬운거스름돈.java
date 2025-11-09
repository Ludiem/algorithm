package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1970_쉬운거스름돈 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		int[] moneyType = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		String[] result = new String[T];
		
		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			
			int N = Integer.parseInt(br.readLine());
			int[] moneyCount = new int[moneyType.length];
			
			
			for (int i = 0; i < moneyType.length; i++) {
				if (N % moneyType[i] == 0) {
					moneyCount[i] += N / moneyType[i];
					break;
				}
				else {
					moneyCount[i] += N / moneyType[i];
					N = N % moneyType[i];
				}
			}
			
			for (int i = 0; i < moneyCount.length; i++) {
				sb.append(moneyCount[i] + " ");
			}
			
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d\n%s\n", test_case + 1, result[test_case]);
		}
		
		br.close();
	}
}