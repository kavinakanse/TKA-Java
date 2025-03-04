package com.employeeproject;

public class MainEmployee {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(1);
		e.setName("kavina");
		e.setAge(22);
		e.setMaritalStatus("Single");
		e.setRole("Developer");
		e.setExperience(0);
		e.setSalary(25000);
		System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getAge()+" "+e.getMaritalStatus()+" "+e.getRole()+" "+e.getExperience()+" "+e.getSalary());
	}
	
	
}
