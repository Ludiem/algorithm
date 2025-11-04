package d1;

import java.util.Scanner;

public class Solution_2072_홀수만더하기 {
 
    public static void main(String[] args) {
        int numCase; // 케이스의 갯수
        int[][] numArray; // 사용자가 입력한 케이스값 가변 배열
        int[] result; // 각 케이스 중 홀수만 더한 배열값
 
        Scanner sc = new Scanner(System.in);
        // 사용자 입력 받음
 
        // 사용자의 입력 제약
        // 정수형이 아니거나, 입력 범위 초과시 재입력 요청
        while (true) {
            if (sc.hasNextInt()) {
                numCase = sc.nextInt();
                if (numCase >= 0 && numCase <= 10000) {
                    break;
                } else {
                    System.out.println("0 이상 10000 이하의 정수를 입력해주세요.");
                }
            } else {
                System.out.println("0 이상 10000 이하의 정수를 입력해주세요.");
                sc.next();
            }
        }
 
        // 가변 배열의 크기를 사용자의 입력 케이스 크기로 정의
        numArray = new int[numCase][10];
        result = new int[numCase];
 
        // 사용자의 테스트 케이스 입력 제약
        // 정수형이 아니거나, 입력 범위 초과시 재입력 요청
        for (int t = 0; t < numCase; t++) {
            for (int num = 0; num < 10; num++) {
                while (true) {
                    if (sc.hasNextInt()) {
                        int numTemp = sc.nextInt();
 
                        if (numTemp >= 0 && numTemp <= 10000) {
                            numArray[t][num] = numTemp;
                             
                            // 제약 조건 만족시 값이 홀수인지 판별하여 result 배열값에 삽입
                            if (numTemp % 2 != 0)
                                result[t] += numTemp;
                            break;
                        } else {
                            System.out.println("0 이상 10000 이하의 정수를 입력해주세요.");
                        }
                    } else {
                        System.out.println("0 이상 10000 이하의 정수를 입력해주세요.");
                        sc.next();
                    }
                }
            }
        }
 
        // 테스트 케이스 출력
        for (int t = 0; t < numCase; t++) {
            System.out.printf("#%d %d\n", t + 1, result[t]);
        }
    }
}