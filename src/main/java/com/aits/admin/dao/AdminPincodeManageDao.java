package com.aits.admin.dao;

import java.util.List;

import com.aits.model.PincodeMaster;

public interface AdminPincodeManageDao {

	public List getAllPincode();
	public void addPincode(PincodeMaster pincodeMaster);
	public PincodeMaster getPincodeById(int pincodeId);
	public void updatePincode(PincodeMaster pincodeMaster);
	public void deletePincode(int pincodeId);

}
