package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1959_두개의숫자열 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        
        for (int test_case = 0; test_case < T; test_case++) {
        	st = new StringTokenizer(br.readLine());
        	int N = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	int[] ai = new int[N];
        	int[] bj = new int[M];
        	int max = 0;
        	
        	st = new StringTokenizer(br.readLine());
        	for (int i = 0; i < N; i++) {
        		ai[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	st = new StringTokenizer(br.readLine());
        	for (int i = 0; i < M; i++) {
        		bj[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	if (N <= M) {
        		for (int i = 0; i <= M - N; i++) {
        			int multiply = 0;
        			
        			for (int i2 = 0; i2 < N; i2++) {
        				multiply += bj[i+i2] * ai[i2];
        			}
        			
        			if (max < multiply) max = multiply;
        		}
        	} else {
        		for (int i = 0; i <= N - M; i++) {
        			int multiply = 0;
        			
        			for (int i2 = 0; i2 < M; i2++) {
        				multiply += ai[i+i2] * bj[i2];
        			}
        			
        			if (max < multiply) max = multiply;
        		}
        	}
        	
        	result[test_case] = max;
        }
        
        for (int test_case = 0; test_case < T; test_case++) {
        	System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
        }
        
        br.close();
	}
}
