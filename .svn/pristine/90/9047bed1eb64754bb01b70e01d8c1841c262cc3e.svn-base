package com.aits.model;

import java.util.List;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;


@Entity
@Table(name = "Address_Master")
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="addressId")
public class AddressMaster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_Id")
	private int addressId;

	@Column(name = "Address_Line_1", length = 100)
	private String addressLine1;

	@Column(name = "Address_Line_2", length = 100)
	private String addressLine2;

	@OneToOne(targetEntity = PincodeMaster.class, cascade = { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.REMOVE })
	@JoinColumn(name = "Fk_PincodeId")
	private PincodeMaster pincodeMaster;

	@JsonBackReference
	@OneToOne(targetEntity = EndUserDetails.class, cascade = { CascadeType.DETACH, CascadeType.MERGE,
			CascadeType.REFRESH, CascadeType.REMOVE }, mappedBy = "addressMaster")
	private EndUserDetails endUserDetails;

	@Transient
	private List<AddressMaster> addressMasterList;
	
	@Column(name = "Is_Active", length = 2)
	private String isActive;

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public PincodeMaster getPincodeMaster() {
		return pincodeMaster;
	}

	public void setPincodeMaster(PincodeMaster pincodeMaster) {
		this.pincodeMaster = pincodeMaster;
	}

	public EndUserDetails getEndUserDetails() {
		return endUserDetails;
	}

	public void setEndUserDetails(EndUserDetails endUserDetails) {
		this.endUserDetails = endUserDetails;
	}

	public List<AddressMaster> getAddressMasterList() {
		return addressMasterList;
	}

	public void setAddressMasterList(List<AddressMaster> addressMasterList) {
		this.addressMasterList = addressMasterList;
	}
}
