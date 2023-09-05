package com.ladakh.pojos;

import java.util.List;



public class ServiceResponseList {



	private String returnStatus;
	private List <ApplicationStatusList>appStatusList;
	
	
	/**
	 * @return the returnStatus
	 */
	public String getReturnStatus() {
		return returnStatus;
	}
	/**
	 * @param returnStatus the returnStatus to set
	 */
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}
	/**
	 * @return the appStatusList
	 */
	public List<ApplicationStatusList> getAppStatusList() {
		return appStatusList;
	}
	/**
	 * @param appStatusList the appStatusList to set
	 */
	public void setAppStatusList(List<ApplicationStatusList> appStatusList) {
		this.appStatusList = appStatusList;
	}
	
	

	
}
