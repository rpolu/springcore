package com.elegant.lic.polacy.service;

import com.elegant.lic.policy.model.PolacyModel;

public interface PolacyService {
	/**
	 * For taking Polacy
	 * 
	 * @param polacyModel
	 * @param a
	 */
	public void savePolacy(PolacyModel polacyModel);

	/**
	 * Get the polacy Details based pNum
	 * 
	 * @param pNum
	 * @return
	 */
	public PolacyModel getPolacyDetails(String pNum);

}
