package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1966_숫자를정렬하자 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;

        int T = Integer.parseInt(br.readLine());
        String[] result = new String[T];
        
        for (int test_case = 0; test_case < T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	int[] array = new int[N];
        	
        	st = new StringTokenizer(br.readLine());
        	sb = new StringBuilder();
        	
        	for (int i = 0; i < N; i++) {
        		array[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	Arrays.sort(array);
        	for (int i = 0; i < N; i++) {
        		sb.append(array[i] + " ");
        	}
        	
        	result[test_case] = sb.toString();
        }
        
        for (int test_case = 0; test_case < T; test_case++) {
        	System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
        }
        
        br.close();
	}
}
