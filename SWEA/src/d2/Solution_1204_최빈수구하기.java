package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_1204_최빈수구하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		int[][] result = new int[T][2];

		for (int test_case = 0; test_case < T; test_case++) {
			result[test_case][0] = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int maxFrequencyNum = 0;
			int maxFrequencyIdx = 0;
			
			int[] point = new int[1000];
			
			for (int i = 0; i < 1000; i++) {
				point[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(point);
			
			List<Integer> listPoint = new ArrayList<Integer>();
			
			for (int p : point) {
				listPoint.add(p);
			}
			
			int[] distinct_point = Arrays.stream(point).distinct().toArray();
			int[] point_num = new int[distinct_point.length];
			
			for (int i = 0; i < point_num.length; i++) {
				point_num[i] = Collections.frequency(listPoint, distinct_point[i]);
				
				if (maxFrequencyNum < point_num[i]) {
					maxFrequencyNum = point_num[i];
				}
			}
			
			for (int i = point_num.length - 1; i >= 0; i--) {
				if (point_num[i] == maxFrequencyNum) {
					maxFrequencyIdx = i;
					break;
				}
			}
			
			result[test_case][1] = distinct_point[maxFrequencyIdx];
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %d\n", result[test_case][0], result[test_case][1]);
		}

		br.close();
	}
}