package com.del.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="contact_Info")
public class ContactDetailsEntity {
	@Id
	@Column(name="contact_Id",length=10)
	@GeneratedValue
	private Integer cid;
	
	@Column(name="contact_name", length=20)
	private String name;
	
	@Column(name="contact_email",length=40)
	private String email;
	
	@Column(name="contact_phno",length=20)
	private String phno;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}

	
	

}

