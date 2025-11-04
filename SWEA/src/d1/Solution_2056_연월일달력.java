package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2056_연월일달력 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder date;
		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		
		int[] dayMax = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int test_case = 0; test_case < T; test_case++) {
			date = new StringBuilder(br.readLine());
			
			int month = Integer.parseInt(date.substring(4, 6));
			int day = Integer.parseInt(date.substring(6, 8));
			
			while(true) {
				if(month < 1 || month > 12) {
					result[test_case] = "-1";
					break;
				} else {
					if(day < 1 || day > dayMax[month]) {
						result[test_case] = "-1";
						break;
					} else {
						date.insert(4, "/");
						date.insert(7, "/");
						result[test_case] = date.toString();
						break;
					}
				}
			}
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}