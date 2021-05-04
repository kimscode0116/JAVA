
public class hanoi {
   
   static int cnt = 0;
   public static void main(String[] args) {
      hanoi(4, "A", "C", "B");
      System.out.println(cnt);
   }

   public static void hanoi(int n, String start, String end, String through) {
      if (n == 1) { // 1일때 이동했다는 메세지 출력
         System.out.println( start + "에서 " + end + "로 이동.");
         cnt++;
         // 한개일때 return
         
      } else {
         hanoi(n - 1, start, through, end); // 4개인 경우에 3개를 중간으로 이동
      
         // 제일 큰 한개를 목적지로 이동.
         System.out.println(start + "에서 " + end + "로 이동");
         cnt++;
         // 나머지 3개를 목적지로 이동.
         hanoi(n - 1, through, end, start);
         
         
      }
   }
}