package com.hospitalproject;

public class MainHospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		h.setpId(101);
		h.setName("Ram");
		h.setAge(60);
		h.setWeight(75.67);
		h.setContact(9184465237L);
		h.setAddress("Pune");
		System.out.println(h.getpId()+" "+h.getName()+" "+h.getAge()+" "+h.getWeight()+" "+h.getContact()+" "+h.getAddress());

	}

}
