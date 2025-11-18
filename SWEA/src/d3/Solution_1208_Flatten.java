package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1208_Flatten {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] result = new int[10];

		for (int test_case = 0; test_case < 10; test_case++) {
			int dumpNum = Integer.parseInt(br.readLine());
			int[] box = new int[100];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 100; i++) {
				box[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < dumpNum; i++) {
				Arrays.sort(box);
				box[0] += 1;
				box[box.length - 1] -= 1;
			}
			
			Arrays.sort(box);
			result[test_case] = box[box.length - 1] - box[0];
		}

		for (int test_case = 0; test_case < 10; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}