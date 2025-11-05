package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1945_간단한소인수분해 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());
        
        int[] primeFactors = {2, 3, 5, 7, 11};
        int[][] result = new int[T][primeFactors.length];
        
        for (int test_case = 0; test_case < T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	while (N != 1) {
        		for (int i = 0; i < primeFactors.length; i++) {
        			if (N % primeFactors[i] == 0) {
        				result[test_case][i] ++;
        				N = N / primeFactors[i];
        			}
        		}
        	}
        }
        
        for (int test_case = 0; test_case < T; test_case++) {
        	sb = new StringBuilder();
        	sb.append("#" + (test_case + 1) + " ");
        	
        	for (int i = 0; i < primeFactors.length; i++) {
        		sb.append(result[test_case][i] + " ");
        	}
        	
        	System.out.println(sb);
        }

        br.close();
	}
}
