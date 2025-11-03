package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_2019_더블더블 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int start = 1;
        
        sb.append(start);
    	sb.append(" ");
        
        for (int i = 0; i < N; i++) {
        	start = start*2;
        	sb.append(start);
        	sb.append(" ");
        }
        
        System.out.println(sb);

        br.close();
	}
}