package d1;

public class Solution_2027_대각선출력하기 {

	public static void main(String[] args) {
		for (int column = 0; column < 5; column++) {
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < column; i++) {
				sb.append("+");
			}

			sb.append("#");

			for (int i = column + 1; i < 5; i++) {
				sb.append("+");
			}

			System.out.println(sb);
		}
	}
}