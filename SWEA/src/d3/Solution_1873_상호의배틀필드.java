package d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1873_상호의배틀필드 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb;
		
		final String FLAT = ".";
		final String BRICK = "*";
		final String STEEL = "#";
		final int UP = 8;
		final int DOWN = 2;
		final int LEFT = 4;
		final int RIGHT = 6;
		
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			sb = new StringBuilder();
			
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			String[][] map = new String[H][W];
			int[] tank = new int[3];
			
			for (int h = 0; h < H; h++) {
				String[] topography = br.readLine().split("");
				
				for (int w = 0; w < W; w++) {
					if (topography[w].equals("^")) {
						tank[0] = h;
						tank[1] = w;
						tank[2] = UP;
					} else if (topography[w].equals("v")) {
						tank[0] = h;
						tank[1] = w;
						tank[2] = DOWN;
					} else if (topography[w].equals("<")) {
						tank[0] = h;
						tank[1] = w;
						tank[2] = LEFT;
					} else if (topography[w].equals(">")) {
						tank[0] = h;
						tank[1] = w;
						tank[2] = RIGHT;
					}
					
					map[h][w] = topography[w];
				}
			}
			
			int N = Integer.parseInt(br.readLine());
			String command = br.readLine().substring(0, N);
			
			for (int c = 0; c < N; c++) {
				if (command.charAt(c) == 'S') {
					if (tank[2] == UP && tank[0] != 0) {
						for (int h = tank[0] - 1; h >= 0; h--) {
							if (map[h][tank[1]].equals(STEEL)) break;
							else if (map[h][tank[1]].equals(BRICK)) {
								map[h][tank[1]] = FLAT;
								break;
							}
						}
					} else if (tank[2] == DOWN && tank[0] != H - 1) {
						for (int h = tank[0] + 1; h < H; h++) {
							if (map[h][tank[1]].equals(STEEL)) break;
							else if (map[h][tank[1]].equals(BRICK)) {
								map[h][tank[1]] = FLAT;
								break;
							}
						}
					} else if (tank[2] == LEFT && tank[1] != 0) {
						for (int w = tank[1] - 1; w >= 0; w--) {
							if (map[tank[0]][w].equals(STEEL)) break;
							else if (map[tank[0]][w].equals(BRICK)) {
								map[tank[0]][w] = FLAT;
								break;
							}
						}
					} else if (tank[2] == RIGHT && tank[1] != W - 1) {
						for (int w = tank[1] + 1; w < W; w++) {
							if (map[tank[0]][w].equals(STEEL)) break;
							else if (map[tank[0]][w].equals(BRICK)) {
								map[tank[0]][w] = FLAT;
								break;
							}
						}
					}
				} else if (command.charAt(c) == 'U') {
					if (tank[0] != 0) {
						if (map[tank[0] - 1][tank[1]].equals(FLAT)) {
							map[tank[0]][tank[1]] = FLAT;
							tank[0] = tank[0] - 1;
						}
					}
					
					tank[2] = UP;
					map[tank[0]][tank[1]] = "^";
				} else if (command.charAt(c) == 'D') {
					if (tank[0] != H - 1) {
						if (map[tank[0] + 1][tank[1]].equals(FLAT)) {
							map[tank[0]][tank[1]] = FLAT;
							tank[0] = tank[0] + 1;
						}
					}
					
					tank[2] = DOWN;
					map[tank[0]][tank[1]] = "v";
				} else if (command.charAt(c) == 'R') {
					if (tank[1] != W - 1) {
						if (map[tank[0]][tank[1] + 1].equals(FLAT)) {
							map[tank[0]][tank[1]] = FLAT;
							tank[1] = tank[1] + 1;
						}
					}
						
					tank[2] = RIGHT;
					map[tank[0]][tank[1]] = ">";
				} else if (command.charAt(c) == 'L') {
					if (tank[1] != 0) { 
						if (map[tank[0]][tank[1] - 1].equals(FLAT)) {
							map[tank[0]][tank[1]] = FLAT;
							tank[1] = tank[1] - 1;
						}
					}
					
					tank[2] = LEFT;
					map[tank[0]][tank[1]] = "<";
				}
			}
			
			System.out.printf("#%d ", test_case);
			for (int h = 0; h < H; h++) {
				sb.setLength(0);
				
				for (int w = 0; w < W; w++) {
					sb.append(map[h][w]);
				}
				
				System.out.println(sb.toString());
			}
		}

		br.close();
	}
}