package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1926_간단한369게임 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		for (int num = 1; num <= N; num++) {
			int temp = num;
			int clap = 0;
			
			while(temp != 0) {
				if (temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9) {
					clap++;
				}
				
				temp = temp / 10;
			}
			
			if (clap == 0) {
				sb.append(num);
			} else {
				for (int n = 0; n < clap; n++) {
					sb.append("-");
				}
			}
			
			sb.append(" ");
		}
		
		System.out.println(sb);
		
		br.close();
	}
}