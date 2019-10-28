package com.elegant.school.factory;

import com.elegant.school.School;

public class SchoolFactory {

	public static School getSchool(String loc) {

		School school = null;

		if (loc.equalsIgnoreCase("hyd")) {

			school = new School();
			school.setId(1001);
			school.setName("Sri Chaitanya school");
			school.setLocation(loc);

		} else if (loc.equalsIgnoreCase("bang")) {

			school = new School();
			school.setId(1002);
			school.setName("CMR school");
			school.setLocation(loc);

		} else {

			throw new IllegalArgumentException("Unknown school");
		}

		return school;
	}
}