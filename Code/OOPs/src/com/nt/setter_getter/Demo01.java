package com.nt.setter_getter;

class Company {
	private int eId;
	private String eName;
	private String eAddress;
	private double eSalary;

	public Company(int id, String name, String address, double salary) {
		this.eId = id;
		this.eName = name;
		this.eAddress = address;
		this.eSalary = salary;
	}

	public void seteId(int id) {
		this.eId = id;
	}

	public void seteName(String name) {
		this.eName = name;
	}

	public void seteAddress(String address) {
		this.eAddress = address;
	}

	public void seteSalary(double salary) {
		this.eSalary = salary;
	}

	public int geteId() {
		return this.eId;
	}

	public String geteName() {
		return this.eName;
	}

	public String geteAddress() {
		return this.eAddress;
	}

	public double geteSalary() {
		return this.eSalary;
	}

	@Override
	public String toString() {
		return "Company [eId=" + eId + ", eName=" + eName + ", eAddress=" + eAddress + ", eSalary=" + eSalary + "]";
	}

}

public class Demo01 {
	public static void main(String[] args) {

		Company emp = new Company(101, "Sopan", "Chhatrapati Sambhajinagar", 30000);
		System.out.println(emp);
		
		emp.seteAddress("ameerpeth Hyderabad");
		emp.seteSalary(emp.geteSalary()+(emp.geteSalary()*0.05));
		System.out.println(emp);

	}
}
