import java.util.*;

/**
 * @author ravit
 *
 */
public class FirstAssignment {
	public static void main(String[] args) {
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Ravi");
		obj.add("Teja");
		obj.add("Kumar");
		obj.add("Reddy");
		obj.add("Ganthi");
		System.out.println("Current ArrayList:"+obj);
		obj.remove("Kumar");
		System.out.println("Removed ArrayList:"+obj);
		ArrayList<String> obj2 = new ArrayList<String>();

		obj2.add("text1");
		obj2.add("text2");
		
		
		
		obj.addAll(obj2);
		System.out.println(obj);
	}

}
