package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4751_다솔이의다이아몬드장식 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			sb = new StringBuilder();
			String word = br.readLine().toString();
			
			for (int i = 0; i < 5; i++) {
				if (i == 0 || i == 4) {
					sb.append("..");
					
					for (int r = 0; r < word.length() - 1; r++) {
						sb.append("#...");
					}
					
					sb.append("#..");
				}
				
				if (i == 2) {
					sb.append("#");
					
					for (int r = 0; r < word.length(); r++) {
						sb.append("." + word.charAt(r) + ".#");
					}
				}
				
				if (i == 1 || i == 3) {
					for (int r = 0; r < word.length() * 5 - (word.length() - 1); r++) {
						if (r % 2 == 0) {
							sb.append(".");
						} else {
							sb.append("#");
						}
					}
				}
				
				sb.append("\n");
			}
			
			result[test_case] = sb.toString();
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("%s", result[test_case]);
		}

		br.close();
	}
}