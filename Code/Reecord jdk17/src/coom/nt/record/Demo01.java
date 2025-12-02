package coom.nt.record;

record Employee(int id, String name) {
}

public class Demo01 {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Sopan");
		Employee e2 = new Employee(102, "Raj");
		System.out.println(e1);
		System.out.println(e2);
	}
}
