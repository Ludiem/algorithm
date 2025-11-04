package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2050_알파벳을숫자로변환 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String headLine = br.readLine();
		
		for (char a: headLine.toCharArray()) sb.append(a-64 + " ");
		
		System.out.println(sb);

		br.close();
	}
}