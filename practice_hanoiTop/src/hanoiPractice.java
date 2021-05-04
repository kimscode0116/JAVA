
public class hanoiPractice {
	static int cnt = 0;
	
	public static void main(String[] args) {
		hanoi(3,"A","C","B");
		System.out.println(cnt);
	}
	

	public static void hanoi(int n, String start, String end, String middle) {
		if(n==1) {
			System.out.println(start+"에서 "+end+"로 이동");
			cnt++;
		}
		else {
			hanoi(n-1, start, middle, end);
			System.out.println(start + "에서 " + end + "로 이동");
			hanoi(n-1, middle, end, start);
			cnt++;
		}
	}
}
