/*
 * Copyright 2012 Denis Neuling 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package com.cloudcontrolled.api.model;

/**
 * The billing account object contains informations about the recipient of the
 * current invoices.
 *
 * @author Denis Neuling (denisneuling@gmail.com)
 *
 */
public class BillingAccount extends AbstractModel {

	private String date_created;
	private Country country;
	private String company;
	private String email;
	private String address_line_2;
	private String address_line_1;
	private String city;
	private SupportPlan support_plan;
	private String name;
	private String lastname;
	private String salutation;
	private String tax_number;
	private String date_modified;
	private User user;
	private String postal_code;
	private String title;
	private String firstname;

	/**
	 * <p>Constructor for BillingAccount.</p>
	 */
	public BillingAccount() {
	}

	/**
	 * <p>Getter for the field <code>date_created</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDate_created() {
		return date_created;
	}

	/**
	 * <p>Setter for the field <code>date_created</code>.</p>
	 *
	 * @param date_created a {@link java.lang.String} object.
	 */
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	/**
	 * <p>Getter for the field <code>country</code>.</p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.Country} object.
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * <p>Setter for the field <code>country</code>.</p>
	 *
	 * @param country a {@link com.cloudcontrolled.api.model.Country} object.
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

	/**
	 * <p>Getter for the field <code>company</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * <p>Setter for the field <code>company</code>.</p>
	 *
	 * @param company a {@link java.lang.String} object.
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * <p>Getter for the field <code>email</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <p>Setter for the field <code>email</code>.</p>
	 *
	 * @param email a {@link java.lang.String} object.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * <p>Getter for the field <code>address_line_2</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress_line_2() {
		return address_line_2;
	}

	/**
	 * <p>Setter for the field <code>address_line_2</code>.</p>
	 *
	 * @param address_line_2 a {@link java.lang.String} object.
	 */
	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	/**
	 * <p>Getter for the field <code>address_line_1</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getAddress_line_1() {
		return address_line_1;
	}

	/**
	 * <p>Setter for the field <code>address_line_1</code>.</p>
	 *
	 * @param address_line_1 a {@link java.lang.String} object.
	 */
	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	/**
	 * <p>Getter for the field <code>city</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <p>Setter for the field <code>city</code>.</p>
	 *
	 * @param city a {@link java.lang.String} object.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * <p>Getter for the field <code>support_plan</code>.</p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.SupportPlan} object.
	 */
	public SupportPlan getSupport_plan() {
		return support_plan;
	}

	/**
	 * <p>Setter for the field <code>support_plan</code>.</p>
	 *
	 * @param support_plan a {@link com.cloudcontrolled.api.model.SupportPlan} object.
	 */
	public void setSupport_plan(SupportPlan support_plan) {
		this.support_plan = support_plan;
	}

	/**
	 * <p>Getter for the field <code>name</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getName() {
		return name;
	}

	/**
	 * <p>Setter for the field <code>name</code>.</p>
	 *
	 * @param name a {@link java.lang.String} object.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * <p>Getter for the field <code>lastname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <p>Setter for the field <code>lastname</code>.</p>
	 *
	 * @param lastname a {@link java.lang.String} object.
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * <p>Getter for the field <code>salutation</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * <p>Setter for the field <code>salutation</code>.</p>
	 *
	 * @param salutation a {@link java.lang.String} object.
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	/**
	 * <p>Getter for the field <code>tax_number</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTax_number() {
		return tax_number;
	}

	/**
	 * <p>Setter for the field <code>tax_number</code>.</p>
	 *
	 * @param tax_number a {@link java.lang.String} object.
	 */
	public void setTax_number(String tax_number) {
		this.tax_number = tax_number;
	}

	/**
	 * <p>Getter for the field <code>date_modified</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getDate_modified() {
		return date_modified;
	}

	/**
	 * <p>Setter for the field <code>date_modified</code>.</p>
	 *
	 * @param date_modified a {@link java.lang.String} object.
	 */
	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	/**
	 * <p>Getter for the field <code>user</code>.</p>
	 *
	 * @return a {@link com.cloudcontrolled.api.model.User} object.
	 */
	public User getUser() {
		return user;
	}

	/**
	 * <p>Setter for the field <code>user</code>.</p>
	 *
	 * @param user a {@link com.cloudcontrolled.api.model.User} object.
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * <p>Getter for the field <code>postal_code</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getPostal_code() {
		return postal_code;
	}

	/**
	 * <p>Setter for the field <code>postal_code</code>.</p>
	 *
	 * @param postal_code a {@link java.lang.String} object.
	 */
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	/**
	 * <p>Getter for the field <code>title</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <p>Setter for the field <code>title</code>.</p>
	 *
	 * @param title a {@link java.lang.String} object.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * <p>Getter for the field <code>firstname</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <p>Setter for the field <code>firstname</code>.</p>
	 *
	 * @param firstname a {@link java.lang.String} object.
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	/** {@inheritDoc} */
	@Override
	public String toString() {
		return "BillingAccount [date_created=" + date_created + ", country=" + country + ", company=" + company + ", email=" + email + ", address_line_2=" + address_line_2 + ", address_line_1=" + address_line_1 + ", city=" + city + ", support_plan=" + support_plan + ", name=" + name + ", lastname="
				+ lastname + ", salutation=" + salutation + ", tax_number=" + tax_number + ", date_modified=" + date_modified + ", user=" + user + ", postal_code=" + postal_code + ", title=" + title + ", firstname=" + firstname + "]";
	}
}
