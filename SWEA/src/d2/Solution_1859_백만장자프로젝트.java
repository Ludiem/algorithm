package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1859_백만장자프로젝트 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        long[] result = new long[T];

        for (int test_case = 0; test_case < T; test_case++) {
            int N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] prices = new int[N];
            int maxPrice = 0;
            
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(st.nextToken());
            }
            
            for (int i = prices.length - 1; i >= 0; i--) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i];     // 새로운 최대값 갱신
                } else {
                	result[test_case] += (maxPrice - prices[i]); // 싸게 사서 나중에 판 이익 누적
                }
            }
        }
        
        for (int test_case = 0; test_case < T; test_case++) {
        	System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
        }

        br.close();
	}
}
