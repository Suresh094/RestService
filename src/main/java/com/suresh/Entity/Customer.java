package com.suresh.Entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "customer", uniqueConstraints = { @UniqueConstraint(columnNames = "first_name"),
		@UniqueConstraint(columnNames = "last_name") })

// @Data
@Access(AccessType.FIELD)
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private Integer custIdPk;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	private String email;

	private String Company;

	public void setCustIdPk(Integer custIdPk) {
		this.custIdPk = custIdPk;
	}

	public int getCustIdPk() {
		return custIdPk;
	}

	public void setCustIdPk(int custIdPk) {
		this.custIdPk = custIdPk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public Customer() {
		super();
	}

	public Customer(Integer custIdPk, String firstName, String lastName, String email, String company) {
		super();
		this.custIdPk = custIdPk;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		Company = company;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customers [custIdPk=");
		builder.append(custIdPk);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", Company=");
		builder.append(Company);
		builder.append("]");
		return builder.toString();
	}

}
