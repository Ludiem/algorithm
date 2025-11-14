package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4406_모음이보이지않는사람 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			char[] word = br.readLine().toCharArray();
			
			for (int wordIdx = 0; wordIdx < word.length; wordIdx++) {
				boolean distinctCheck = false;
				
				for (int vowelIdx = 0; vowelIdx < vowel.length; vowelIdx++) {
					if (word[wordIdx] == vowel[vowelIdx]) {
						distinctCheck = true;
						break;
					}
				}
				
				if (!distinctCheck) sb.append(String.valueOf(word[wordIdx]));
			}
			
			result[test_case] = sb.toString();
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}