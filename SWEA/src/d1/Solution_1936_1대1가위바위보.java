package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1936_1대1가위바위보 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		switch (A) {
			case 1:
				switch (B) {
				case 2:
					System.out.println("B");
				case 3:
					System.out.println("A");
				}
			case 2:
				switch (B) {
				case 1:
					System.out.println("A");
				case 3:
					System.out.println("B");
				}
			case 3:
				switch (B) {
				case 1:
					System.out.println("B");
				case 2:
					System.out.println("A");
				}
		}

		br.close();
	}
}