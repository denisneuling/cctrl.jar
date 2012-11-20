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
 * 
 * @author Denis Neuling (denisneuling@gmail.com)
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

	public BillingAccount() {
	}

	public String getDate_created() {
		return date_created;
	}

	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress_line_2() {
		return address_line_2;
	}

	public void setAddress_line_2(String address_line_2) {
		this.address_line_2 = address_line_2;
	}

	public String getAddress_line_1() {
		return address_line_1;
	}

	public void setAddress_line_1(String address_line_1) {
		this.address_line_1 = address_line_1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SupportPlan getSupport_plan() {
		return support_plan;
	}

	public void setSupport_plan(SupportPlan support_plan) {
		this.support_plan = support_plan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getTax_number() {
		return tax_number;
	}

	public void setTax_number(String tax_number) {
		this.tax_number = tax_number;
	}

	public String getDate_modified() {
		return date_modified;
	}

	public void setDate_modified(String date_modified) {
		this.date_modified = date_modified;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "BillingAccount [date_created=" + date_created + ", country=" + country + ", company=" + company + ", email=" + email + ", address_line_2=" + address_line_2 + ", address_line_1=" + address_line_1 + ", city=" + city + ", support_plan=" + support_plan + ", name=" + name + ", lastname="
				+ lastname + ", salutation=" + salutation + ", tax_number=" + tax_number + ", date_modified=" + date_modified + ", user=" + user + ", postal_code=" + postal_code + ", title=" + title + ", firstname=" + firstname + "]";
	}
}
