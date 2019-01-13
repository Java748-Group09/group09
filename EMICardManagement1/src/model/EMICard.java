package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "EMICard")
public class EMICard implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cardID;
	private Date validDate;
	private String cardType;
	private int credits;
	private int remaingCredits;
	private Boolean activated;
	@OneToOne(mappedBy = "EMICard")
	private Customer customer;
	public int getCardID() {
		return cardID;
	}
	public void setCardID(int cardID) {
		this.cardID = cardID;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public int getRemaingCredits() {
		return remaingCredits;
	}
	public void setRemaingCredits(int remaingCredits) {
		this.remaingCredits = remaingCredits;
	}
	public Boolean getActivated() {
		return activated;
	}
	public void setActivated(Boolean activated) {
		this.activated = activated;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "EMICard [cardID=" + cardID + ", validDate=" + validDate + ", cardType=" + cardType + ", credits="
				+ credits + ", remaingCredits=" + remaingCredits + ", activated=" + activated + ", customer=" + customer
				+ "]";
	}
	public EMICard(int cardID, Date validDate, String cardType, int credits, int remaingCredits, Boolean activated,
			Customer customer) {
		super();
		this.cardID = cardID;
		this.validDate = validDate;
		this.cardType = cardType;
		this.credits = credits;
		this.remaingCredits = remaingCredits;
		this.activated = activated;
		this.customer = customer;
	}
	public EMICard() {
		super();
	}
	
	
	


}
