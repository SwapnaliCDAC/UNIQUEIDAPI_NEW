package com.ladakh.pojos;

public class ApplicationSubmissionStatus {
	private boolean appSubmissionStatus;
	private String appSubmissionErrorMsg;
	public boolean getAppSubmissionStatus() {
		return appSubmissionStatus;
	}
	public String getAppSubmissionErrorMsg() {
		return appSubmissionErrorMsg;
	}
	public void setAppSubmissionStatus(boolean appSubmissionStatus) {
		this.appSubmissionStatus = appSubmissionStatus;
	}
	public void setAppSubmissionErrorMsg(String appSubmissionErrorMsg) {
		this.appSubmissionErrorMsg = appSubmissionErrorMsg;
	}
}
