package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1933_간단한N의약수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				sb.append(i);
				sb.append(" ");
			}
		}
		
		System.out.println(sb);

		br.close();
	}
}