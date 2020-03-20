package com.elegant.lic.polacy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elegant.lic.polacy.dao.PolacyDao;
import com.elegant.lic.polacy.service.PolacyService;
import com.elegant.lic.policy.model.PolacyModel;

@Service
public class PolacyServiceImpl implements PolacyService {

	@Autowired
	private PolacyDao polacyDao;

	public void savePolacy(PolacyModel polacyModel) {
		polacyDao.savePolacy(polacyModel);
	}

	public PolacyModel getPolacyDetails(String pNum) {
		return null;
	}

}
