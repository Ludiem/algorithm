package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_24420_집합비교 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int[] A = new int[Integer.parseInt(st.nextToken())];
			int[] B = new int[Integer.parseInt(st.nextToken())];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < A.length; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < B.length; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(B);

			if (A.length == B.length) {
				result[test_case] = "=";
				
				for (int i = 0; i < A.length; i++) {
					int find = Arrays.binarySearch(B, A[i]);

					if (find < 0) {
						result[test_case] = "?";
						break;
					}
				}
			} else if (A.length < B.length) {
				result[test_case] = "<";
				
				for (int i = 0; i < A.length; i++) {
					int find = Arrays.binarySearch(B, A[i]);

					if (find < 0) {
						result[test_case] = "?";
						break;
					}
				}
			} else if (A.length > B.length) {
				result[test_case] = ">";
				
				for (int i = 0; i < B.length; i++) {
					int find = Arrays.binarySearch(A, B[i]);

					if (find < 0) {
						result[test_case] = "?";
						break;
					}
				}
			}
		}

		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("%s\n", result[test_case]);
		}

		br.close();
	}
}