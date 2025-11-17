package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8741_두문자어 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			String word = br.readLine().toUpperCase().toString();
			String[] splitWord = word.split(" ");
			
			for (int i = 0; i < splitWord.length; i++) {
				sb.append(splitWord[i].charAt(0));
			}
			
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}