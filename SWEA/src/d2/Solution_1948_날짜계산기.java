package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1948_날짜계산기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			
			int month[] = new int[2];
			int day[] = new int[2] ;
			
			for (int i = 0; i < 2; i++) {
				month[i] = Integer.parseInt(st.nextToken());
				day[i] = Integer.parseInt(st.nextToken());
			}
			
			if(month[0] == month[1]) {
				result[test_case] += day[1] - day[0] + 1;
			} else {
				result[test_case] += date[month[0]] - day[0];
				
				for (int i = month[0] + 1; i < month[1]; i++) {
					result[test_case] += date[i];
				}
				
				result[test_case] += day[1] + 1;
			}
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}
