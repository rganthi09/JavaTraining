public class EmployeeMethod {
	  int id;
	  String name;
	  String dept;
	
	EmployeeMethod(String name, int id, String dept){
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		print();
	}
	void print(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
		
	}
	
	/**public static void main(String[] args) {
		EmployeeMethod emp = new EmployeeMethod("ravi", 33, "CSE");
		emp.print();
		
	}**/
}
 