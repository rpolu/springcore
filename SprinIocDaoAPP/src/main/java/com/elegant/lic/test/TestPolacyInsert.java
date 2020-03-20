package com.elegant.lic.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.lic.polacy.service.PolacyService;
import com.elegant.lic.policy.model.PolacyModel;

public class TestPolacyInsert {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		PolacyModel polacyModel = new PolacyModel();

		System.out.println("Please eneter the Polacy Number");
		String pNum = scanner.next();
		polacyModel.setpNum(pNum);

		System.out.println("Please eneter the Polacy Name");

		String name = scanner.next();
		polacyModel.setName(name);

		System.out.println("Please eneter the Polacy Premium");
		double premium = scanner.nextDouble();
		polacyModel.setPremium(premium);

		System.out.println("Please eneter the Polacy Tenture");
		int tenture = scanner.nextInt();
		polacyModel.setTenture(tenture);
		System.out.println("Please eneter the Polacy Address");
		String address = scanner.next();
		polacyModel.setAddress(address);
		
		ClassPathXmlApplicationContext cxac = new ClassPathXmlApplicationContext("applicationContext.xml");
		PolacyService polacyService = cxac.getBean(PolacyService.class);
		polacyService.savePolacy(polacyModel);
		System.out.println("Polcay details are saved successfully");
		scanner.close();
		cxac.close();
	}

}
