package com.ladakh.pojos;

public class Tehsil1 {


	
	private String tehsiCode;
	private String tehsilName;
	
	public Tehsil1() {
		// TODO Auto-generated constructor stub
	}

	public Tehsil1(String tehsiCode, String tehsilName) {
		super();
		
		this.tehsiCode = tehsiCode;
		this.tehsilName = tehsilName;
	}

	public String getTehsiCode() {
		return tehsiCode;
	}

	public void setTehsiCode(String tehsiCode) {
		this.tehsiCode = tehsiCode;
	}

	public String getTehsilName() {
		return tehsilName;
	}

	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	@Override
	public String toString() {
		return "Tehsil [tehsiCode=" + tehsiCode + ", tehsilName=" + tehsilName + "]";
	}
	
}
