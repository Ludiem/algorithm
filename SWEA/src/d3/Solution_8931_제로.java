package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Solution_8931_제로 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int TC = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= TC; test_case++) {
			int K = Integer.parseInt(br.readLine());
			Stack<Integer> stack = new Stack<Integer>();
			int total = 0;
			
			for (int i = 0; i < K; i++) {
				int num = Integer.parseInt(br.readLine());
				
				if (num != 0) {
					stack.push(num);
				} else {
					if (!stack.isEmpty()) stack.pop();
				}
			}
			
			while (!stack.isEmpty()) total += stack.pop();
			
			System.out.println("#" + test_case + " " + total);
		}

		br.close();
	}
}