package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_10804_문자열의거울상 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			sb.append(br.readLine());

			String tcWord = sb.reverse().toString();
			sb.setLength(0);

			for (int i = 0; i < tcWord.length(); i++) {
				if (tcWord.charAt(i) == 'b') {
					sb.append("d");
				} else if (tcWord.charAt(i) == 'd') {
					sb.append("b");
				} else if (tcWord.charAt(i) == 'p') {
					sb.append("q");
				} else if (tcWord.charAt(i) == 'q') {
					sb.append("p");
				}
			}
			
			result[test_case] = sb.toString();
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}