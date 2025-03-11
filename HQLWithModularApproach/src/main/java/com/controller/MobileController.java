package com.controller;

import com.service.MobileService;

public class MobileController {

	public static void main(String[] args) {
		
		MobileService ms = new MobileService();
//		ms.insertData();
//		ms.updateData();
//		ms.deleteData();
//		ms.getSingleData();
		ms.getAllData();

	}

}
