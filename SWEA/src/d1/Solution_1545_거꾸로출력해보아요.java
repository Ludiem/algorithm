package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_1545_거꾸로출력해보아요 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for (int i = N; i >= 0; i--) {
        	sb.append(i);
        	sb.append(" ");
        }
        
        System.out.println(sb);

        br.close();
	}
}