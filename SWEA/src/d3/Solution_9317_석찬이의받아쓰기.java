package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_9317_석찬이의받아쓰기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int distinctWord = 0;
			
			char[] word = br.readLine().toCharArray();
			char[] word2 = br.readLine().toCharArray();
			
			for (int i = 0; i < word.length; i++) {
				if (word[i] == word2[i]) distinctWord++;
			}
			
			result[test_case] = distinctWord;
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}