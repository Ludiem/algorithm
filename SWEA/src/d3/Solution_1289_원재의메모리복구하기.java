package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_1289_원재의메모리복구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			char[] memory = br.readLine().toCharArray();
			char[] initialValue = new char[memory.length];
			Arrays.fill(initialValue, '0');
			
			int idx = 0;
			char value = '0';
			int restorationNum = 0;
			
			for (int i = 0; i < memory.length; i++) {
				if (memory[i] == '1') {
					idx = i;
					break;
				}
			}
			
			for (int i = idx; i < memory.length; i++) {
				if (memory[i] != initialValue[i]) {
					restorationNum++;
					value = memory[i];
					
					for (int r = i; r < memory.length; r++) {
						initialValue[r] = value;
					}
				}
			}
			
			result[test_case] = restorationNum;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}