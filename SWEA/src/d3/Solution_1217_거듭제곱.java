package d3;

import java.util.Scanner;

public class Solution_1217_거듭제곱 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] result = new int[10];

		for (int test_case = 0; test_case < 10; test_case++) {
			int caseNum = sc.nextInt();
			
			int[] num = new int[2];
			
			num[0] = sc.nextInt();
			num[1] = sc.nextInt();
			
			int total = 1;
			
			for (int i = 0; i < num[1]; i++) {
				total = total * num[0];
			}
			
			result[caseNum - 1] = total;
		}
		
		for (int test_case = 0; test_case < 10; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		sc.close();
	}
}