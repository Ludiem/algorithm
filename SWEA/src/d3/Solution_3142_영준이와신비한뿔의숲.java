package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_3142_영준이와신비한뿔의숲 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int unicon = 0;
			int twinhorn = N / 2;
			
			while (unicon + twinhorn != M) {
				if (twinhorn * 2 + (M - twinhorn) == N) {
					unicon = M - twinhorn;
				} else {
					twinhorn--;
				}
			}
			
			System.out.println("#" + test_case + " " + unicon + " " + twinhorn);
		}
		
		br.close();
	}
}