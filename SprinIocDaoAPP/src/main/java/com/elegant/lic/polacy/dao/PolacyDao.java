package com.elegant.lic.polacy.dao;

import com.elegant.lic.policy.model.PolacyModel;

/**
 * Polacy Drud DAO
 * 
 * @author rpolu
 *
 */
public interface PolacyDao {

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
