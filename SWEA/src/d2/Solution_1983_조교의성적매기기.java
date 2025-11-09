package d2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1983_조교의성적매기기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		String[] result = new String[T];
		String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

		for (int test_case = 0; test_case < T; test_case++) {
			st = new StringTokenizer(br.readLine());
			
			int studentNum = Integer.parseInt(st.nextToken());
			int findNum = Integer.parseInt(st.nextToken());
			int[] totalPoint = new int[studentNum];
			
			for (int i = 0; i < studentNum; i++) {
				st = new StringTokenizer(br.readLine());
				int midtermExam = Integer.parseInt(st.nextToken());
				int finalExam = Integer.parseInt(st.nextToken());
				int assignment = Integer.parseInt(st.nextToken());
				
				totalPoint[i] = (int) Math.round(midtermExam * 0.35 + finalExam * 0.45 + assignment * 0.20);
			}
			
			int findPoint = totalPoint[findNum - 1];
			
			Arrays.sort(totalPoint);
			
			for (int i = 0; i < totalPoint.length; i++) {
				if (findPoint == totalPoint[i]) {
					result[test_case] = grade[i / (studentNum / 10)];
				}
			}
		}
		
		for (int test_case = 0; test_case < T; test_case++) {
			System.out.printf("#%d %s\n", test_case + 1, result[test_case]);
		}

		br.close();
	}
}