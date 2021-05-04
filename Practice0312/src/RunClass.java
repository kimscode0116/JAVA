
public class RunClass {
	public static void main(String[] args) {
		int a = 4;
		boolean r1 = a == 4;
		System.out.println(r1);
		
		r1 = a > 0;
		System.out.println(r1);
		
		r1 = a <= 10;
		System.out.println(r1);
		
		r1 = a != 2;
		System.out.println(r1);
	
		r1 = a > 10 && a == 20;
		System.out.println(r1);
		
		r1 = a < 10 && a % 4 == 0;
		System.out.println(r1);
		
		r1 = a == 10 || a < 10;
		System.out.println(r1);
		
		r1 = true && true;
		System.out.println(r1);
		
		r1 = true || false;
		System.out.println(r1);
		
		r1 = !false;
		System.out.println(r1);
	}
}
