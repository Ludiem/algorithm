package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2007_패턴마디의길이 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			int findIdx = 0;
			
			String word = br.readLine();
			char wordFirst = word.charAt(0);
			String[] wordArray = word.split(String.valueOf(wordFirst));
			
			for (int i = 2; i < wordArray.length; i++) {
				if (wordArray[1].equals(wordArray[i])) {
					findIdx = i;
					break;
				}
			}
			
			for (int i = 1; i < findIdx; i++) {
				sb.append(String.valueOf(wordFirst));
				sb.append(wordArray[i]);
			}
			
			result[test_case] = sb.toString().length();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}