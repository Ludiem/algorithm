package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1215_회문1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		
		int[] result = new int[10];

		for (int test_case = 0; test_case < 10; test_case++) {
			int len = Integer.parseInt(br.readLine());
			char[][] board = new char[8][8];
			int total = 0;
			
			for (int i = 0; i < 8; i++) {
				board[i] = br.readLine().toCharArray();
			}
			
			for (int i = 0; i < 8; i++) {
				for (int r = 0; r < 8 - len + 1; r++) {
					sb = new StringBuilder();
					String word;
					String wordReverse;
					
					for (int w = 0; w < len; w++) {
						sb.append(board[i][r + w]);
					}
					
					word = sb.toString();
					wordReverse = sb.reverse().toString();
					
					if (word.equals(wordReverse)) total++;
				}
			}
			
			for (int i = 0; i < 8; i++) {
				for (int r = 0; r < 8 - len + 1; r++) {
					sb = new StringBuilder();
					String word;
					String wordReverse;
					
					for (int w = 0; w < len; w++) {
						sb.append(board[r + w][i]);
					}
					
					word = sb.toString();
					wordReverse = sb.reverse().toString();
					
					if (word.equals(wordReverse)) total++;
				}
			}
			
			result[test_case] = total;
		}
		
		for (int test_case = 0; test_case < 10; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}