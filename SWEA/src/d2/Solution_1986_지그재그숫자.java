package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1986_지그재그숫자 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        
        for (int test_case = 0; test_case < T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	
        	for (int num = 1; num <= N; num++) {
        		if (num % 2 == 0) {
        			result[test_case] -= num;
        		} else result[test_case] += num;
        	}
        }

        for (int test_case = 0; test_case < T; test_case++) {
        	System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
        }
        
        br.close();
	}
}
