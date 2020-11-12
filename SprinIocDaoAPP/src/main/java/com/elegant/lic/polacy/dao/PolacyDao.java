package com.elegant.lic.polacy.dao;

import com.elegant.lic.policy.model.PolacyModel;

/**
 * This class is used for Polacy Crud operations
 * 
 * @author rpolu
 *
 */
public interface PolacyDao {
	/**
	 * To Save the polacy details
	 * 
	 * @param polacyModel
	 */
	public void savePolacy(PolacyModel polacyModel);

	/**
	 * Get the polacy details based on Polacy number
	 * 
	 * @param pNum
	 * @return
	 */
	public PolacyModel getPolacyDetails(String pNum);
}
