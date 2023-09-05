package com.ladakh.pojos;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "tehsil")
public class Tehsil implements Serializable {

	private String tehsilName;
	private String tehsilId;
	private String district;

	// private long sequence;
	// private long test_sequence;

//	private Collection<Csc> cscUsers;

	/**
	 * 
	 */
	public Tehsil() {
		super();
		// this.test_sequence=9999800;
	}

	/**
	 * @return the district
	 */

	@Column(name = "district_id")
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	
	/**
	 * @return the tehsilName
	 */
	@Column(name = "tehsil_name")
	public String getTehsilName() {
		return tehsilName;
	}

	/**
	 * @param tehsilName the tehsilName to set
	 */
	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	/**
	 * @return the tehsilId
	 */
	@Id
	@Column(name = "tehsil_id")
	public String getTehsilId() {
		return tehsilId;
	}

	/**
	 * @param tehsilId the tehsilId to set
	 */
	public void setTehsilId(String tehsilId) {
		this.tehsilId = tehsilId;
	}

	
}
