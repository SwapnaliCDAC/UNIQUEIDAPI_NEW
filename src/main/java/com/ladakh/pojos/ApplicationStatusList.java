package com.ladakh.pojos;

import java.io.Serializable;

public class ApplicationStatusList implements Serializable{



	private String statusType;
	private String statusName;   //contains status-title
	private String statusLevelId; //contains status-level-id
	private String statusSerialNumber;   //contains status-no
	private String remark;
	private String statusMsg;
	private String dateTimeOfUpdate;
	private String attachment;
	
	//added for modified response xsd
	private String levelId;
	
	/**
	 * @return the levelId
	 */
	public String getLevelId() {
		return levelId;
	}
	/**
	 * @param levelId the levelId to set
	 */
	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}
	/**
	 * @return the statusType
	 */
	public String getStatusType() {
		return statusType;
	}
	/**
	 * @param statusType the statusType to set
	 */
	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
	/**
	 * @return the statusMsg
	 */
	public String getStatusMsg() {
		return statusMsg;
	}
	/**
	 * @param statusMsg the statusMsg to set
	 */
	public void setStatusMsg(String statusMsg) {
		this.statusMsg = statusMsg;
	}
	
	/**
	 * @return the dateTimeOfUpdate
	 */
	public String getDateTimeOfUpdate() {
		return dateTimeOfUpdate;
	}
	/**
	 * @param dateTimeOfUpdate the dateTimeOfUpdate to set
	 */
	public void setDateTimeOfUpdate(String dateTimeOfUpdate) {
		this.dateTimeOfUpdate = dateTimeOfUpdate;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the attachment
	 */
	public String getAttachment() {
		return attachment;
	}
	/**
	 * @param attachment the attachment to set
	 */
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	/**
	 * @return the statusName
	 */
	public String getStatusName() {
		return statusName;
	}
	/**
	 * @param statusName the statusName to set
	 */
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	/**
	 * @return the statusSerialNumber
	 */
	public String getStatusSerialNumber() {
		return statusSerialNumber;
	}
	/**
	 * @param statusSerialNumber the statusSerialNumber to set
	 */
	public void setStatusSerialNumber(String statusSerialNumber) {
		this.statusSerialNumber = statusSerialNumber;
	}
	/**
	 * @return the statusLevelId
	 */
	public String getStatusLevelId() {
		return statusLevelId;
	}
	/**
	 * @param statusLevelId the statusLevelId to set
	 */
	public void setStatusLevelId(String statusLevelId) {
		this.statusLevelId = statusLevelId;
	}



}
