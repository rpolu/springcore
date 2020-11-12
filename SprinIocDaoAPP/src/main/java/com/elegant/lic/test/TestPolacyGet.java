package com.elegant.lic.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.elegant.lic.polacy.service.PolacyService;
import com.elegant.lic.policy.model.PolacyModel;

public class TestPolacyGet {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please eneter the Polacy Number");
		String pNum = scanner.next();
		scanner.close();
		ClassPathXmlApplicationContext cxac = new ClassPathXmlApplicationContext("applicationContext.xml");
		PolacyService ps = cxac.getBean(PolacyService.class);
		PolacyModel pm = ps.getPolacyDetails(pNum);

		System.out.println(pm.getName());
		System.out.println(pm.getPremium());
		System.out.println(pm.getAddress());
		System.out.println(pm.getTenture());
		cxac.close();
	}

}
