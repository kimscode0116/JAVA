package project0319;

import java.util.Arrays; // 1~100까지의 숫자 중 30개의 숫자를 랜덤으로 받아 배열전,배열후다 출력
import java.util.Random;

public class homework3 {
   public static void main(String[] args) {
      int arr[] = new int[30];

      Random r = new Random();
      for (int i = 0; i < arr.length; i++) {
         arr[i] = r.nextInt(100)+1;
      //배열 전
      }
      System.out.println(Arrays.toString(arr));

      // j는 0부터 시작하는데 한번 돌때마다 1씩 증가한다 j가 arr크기 - 1보다 작을때까지만
      for(int j = 0; j < arr.length; j++) {
         for(int k = j; k < arr.length; k++){
            if(arr[j] > arr[k]) { //부등호 반대로 하면 바뀜
               int arrNum = arr[j];
               arr[j] = arr[k];
               arr[k] = arrNum;
            }
         }
      } System.out.println(Arrays.toString(arr));
      }
   }
