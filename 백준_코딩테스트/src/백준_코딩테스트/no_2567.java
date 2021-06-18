package 백준_코딩테스트;

import java.io.FileInputStream;
import java.util.Scanner;

public class no_2567 {

	   public static void main(String[] args) throws Exception {
	      // 입력처리
	      System.setIn(new FileInputStream("src/input2567.txt"));
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt(); // 4
	      int cnt = 0;

	      // 도화지 만들기
	      int[][] map = new int[100][100];

	      // 색종이
	      for (int i = 0; i < n; i++) {
	         int x = sc.nextInt();
	         int y = sc.nextInt();

	         for (int j = x; j < x + 10; j++) {
	            for (int k = y; k < y + 10; k++) {
	               map[j][k] = 1; // 색종이 면적 1로 칠함.
	            }
	         }
	      }
	      // 둘레구하기
	      for (int i = 0; i < map.length; i++) {
	         for (int j = 0; j < map.length; j++) {
	            if (map[i][j] == 1) { // 칠해져 있는 애들만 본다.
	               if (map[i][j+1] == 0) { // 상
	                  cnt++;
	               }
	               if (map[i][j-1] == 0) { // 하
	                  cnt++;
	               }
	               if (map[i-1][j] == 0) { // 좌
	                  cnt++;
	               }
	               if (map[i+1][j] == 0) { // 우
	                  cnt++;
	               }
	            }
	         }
	      }
	      System.out.println(cnt);
	   }
	}

