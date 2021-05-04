package afternoon;

import java.util.ArrayList;

public class ExecClass2 {
	public static void main(String[] args) {
		// list , map, queue

		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		ArrayList<ExecClass2_CustomClass> c = new ArrayList<ExecClass2_CustomClass>();
		ExecClass2_CustomClass c1 = new ExecClass2_CustomClass();
		c.add(c1);
		c.add(new ExecClass2_CustomClass());
	}
}
