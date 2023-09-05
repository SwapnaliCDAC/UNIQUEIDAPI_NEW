package com.ladakh.pojos;

/**
 * eForms Portal and Back-Office for Jammu & Kashmir State
 * TestYetAnotherEJB.java created on Nov 19, 2010 at 10:36:32 AM by rksinha
 * Copyright (c) 2010-11, CDAC, Bangalore
 */


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * TODO : Write a short summary of this type
 *
 * @author anna
 *
 */
@Entity
@Table(name="citizen_login_details")
public class CitizenLoginDetails implements Serializable{
	
    public CitizenLoginDetails(){
		
	}
	
    private Citizen citizen;
	private String loginId;
    private String password;
    private String status;
    private String token;
	private Date tokenExpiryDate;
	private String securityQue;
	private String securityAns;
	private Boolean securedByQ;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the citizen
	 */
    @OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "czn_id")
	public Citizen getCitizen() {
		return citizen;
	}
	/**
	 * @param citizen the citizen to set
	 */
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	/**
	 * @return the loginId
	 */
	@Id
	@Column(name="login_id")
	public String getLoginId() {
		return loginId;
	}
	/**
	 * @param loginId the loginId to set
	 */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(unique=true, name="token")
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	@Column(name="token_expiry")
	public Date getTokenExpiryDate() {
		return tokenExpiryDate;
	}
	
	public void setTokenExpiryDate(Date tokenExpiryDate) {
		this.tokenExpiryDate = tokenExpiryDate;
	}
	@Column(name="security_que")
	public String getSecurityQue() {
		return securityQue;
	}
	@Column(name="security_ans")
	public String getSecurityAns() {
		return securityAns;
	}
	public void setSecurityQue(String securityQue) {
		this.securityQue = securityQue;
	}
	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}
	@Column(name="secured")
	public Boolean getSecuredByQ() {
		return securedByQ;
	}
	public void setSecuredByQ(Boolean securedByQ) {
		this.securedByQ = securedByQ;
	}
	
	
	

}

