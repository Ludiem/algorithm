package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1206_View {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] result = new int[10];

		for (int test_case = 0; test_case < 10; test_case++) {
			int N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			int[] apt = new int[N];

			for (int i = 0; i < N; i++) {
				apt[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 2; i < N - 2; i++) {
				int secondMax = 0;
				
				if (apt[i - 2] >= apt[i] || apt[i - 1] >= apt[i] || apt[i + 1] >= apt[i] || apt[i + 2] >= apt[i]) {
					continue;
				}

				if (apt[i - 2] > secondMax) secondMax = apt[i - 2];
				if (apt[i - 1] > secondMax) secondMax = apt[i - 1];
				if (apt[i + 1] > secondMax) secondMax = apt[i + 1];
				if (apt[i + 2] > secondMax) secondMax = apt[i + 2];
				
				result[test_case] += apt[i] - secondMax;
			}
		}

		for (int test_case = 0; test_case < 10; test_case++) {
			System.out.printf("#%d %d\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}