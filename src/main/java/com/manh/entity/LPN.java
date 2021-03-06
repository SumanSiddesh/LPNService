package com.manh.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "LPN")
@JsonInclude(JsonInclude.Include. NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LPN {

	@Id
	@GeneratedValue
	@Column(name="LPN_ID")
	@JsonProperty("LPN_ID")
	private Long lpnId;
	
	@Column(name="TC_LPN_ID")
	@JsonProperty("TC_LPN_ID")
	private String tcLpnId;
	
	@Column(name="ITEM_NAME")
	@JsonProperty("ITEM_NAME")
	private String itemName;
	
	@Column(name="CREATED_DTTM")
	@JsonProperty("CREATED_DTTM")
	private Date createdDttm;
	
	@Column(name="UPDATED_DTTM")
	@JsonProperty("UPDATED_DTTM")
	private Date updatedDttm;

	public Long getLpnId() {
		return lpnId;
	}

	public String getTcLpnId() {
		return tcLpnId;
	}

	public String getItemName() {
		return itemName;
	}

	public Date getCreatedDttm() {
		return createdDttm;
	}

	public Date getUpdatedDttm() {
		return updatedDttm;
	}

	public LPN() {
		super();
	}
	
	public LPN(String tcLpnId, String itemName, Date createdDttm, Date updatedDttm) {
		super();
		this.tcLpnId = tcLpnId;
		this.itemName = itemName;
		this.createdDttm = createdDttm;
		this.updatedDttm = updatedDttm;
	}

	@Override
	public String toString() {
		return "LPN [lpnId=" + lpnId + ", tcLpnId=" + tcLpnId + ", itemName=" + itemName + ", createdDttm="
				+ createdDttm + ", updatedDttm=" + updatedDttm + "]";
	}
	
}
