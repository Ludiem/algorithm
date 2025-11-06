package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1989_초심자의회문검사 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;

        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        
        for (int test_case = 0; test_case < T; test_case++) {
        	String word = br.readLine();
        	sb = new StringBuffer(word);
        	sb.reverse();
        	
        	if (word.equals(sb.toString())) {
        		result[test_case] = 1;
        	}
        }
        
        for (int test_case = 0; test_case < T; test_case++) {
        	System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
        }
        
        br.close();
	}
}
