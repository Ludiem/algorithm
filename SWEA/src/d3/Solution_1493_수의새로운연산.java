package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1493_수의새로운연산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[] time = new int[N];
			st = new StringTokenizer(br.readLine());
			
			String result = "Possible";
			int maxTime = 0;
			
			for (int i = 0; i < N; i++) {
				time[i] = Integer.parseInt(st.nextToken());
				if (maxTime < time[i]) maxTime = time[i];
				
				if (time[i] < M) {
					result = "Impossible";
					break;
				}
			}
			
			if (result == "Possible") {
				int currentNum = K;
				for (int second = M; second <= maxTime && currentNum >= 0; second++) {
					if (second != M && second % M == 0) currentNum += K;
					
					for (int customer = 0; customer < N; customer++) {
						if (time[customer] == second) currentNum--;
						
						if (currentNum < 0) {
							result = "Impossible";
							break;
						}
					}
				}
			}
			
			System.out.println("#" + test_case + " " + result);
		}

		br.close();
	}
}