package model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name = "Users")
public class User implements Serializable {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String userId;
	private String emailId;
	private String password;
	private boolean enabled;

	@OneToOne(mappedBy = "Users")
	private Customer customer;

	public User(String userId, String emailId, String password, boolean enabled, Customer customer) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.password = password;
		this.enabled = enabled;
		this.customer = customer;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", emailId=" + emailId + ", password=" + password + ", enabled=" + enabled
				+ ", customer=" + customer + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}