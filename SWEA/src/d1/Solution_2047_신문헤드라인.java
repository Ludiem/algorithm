package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2047_신문헤드라인 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String headLine = br.readLine().toUpperCase();
		System.out.println(headLine);

		br.close();
	}
}