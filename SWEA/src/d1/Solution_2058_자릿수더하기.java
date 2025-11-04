package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2058_자릿수더하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		while(N > 0) {
			result += N % 10;
			N = N / 10;
		}
		
		System.out.println(result);

		br.close();
	}
}