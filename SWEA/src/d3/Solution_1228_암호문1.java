package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_1228_암호문1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;

		for (int test_case = 1; test_case <= 10; test_case++) {
			sb = new StringBuilder();
			int N = Integer.parseInt(br.readLine());
			List<String> cryptogram = new ArrayList<String>();
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				cryptogram.add(st.nextToken());
			}
			
			N = Integer.parseInt(br.readLine());
			String[] command = br.readLine().substring(2).split("I ");
			
			for (int i = 0; i < N; i++) {
				String[] splitCommand = command[i].split(" ");
				int idx = 2;
				
				for (int r = Integer.parseInt(splitCommand[0]); r < Integer.parseInt(splitCommand[0]) + Integer.parseInt(splitCommand[1]); r++) {
					cryptogram.add(r, splitCommand[idx]);
					idx++;
				}
			}
			
			String[] cryptogramArray = cryptogram.toArray(new String[cryptogram.size()]);
			for (int i = 0; i < 10; i++) {
				sb.append(cryptogramArray[i] + " ");
			}
			
			System.out.println("#" + test_case + " " + sb.toString());
		}

		br.close();
	}
}