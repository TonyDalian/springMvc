package com.angular_springmvc.beans;

public class Info {
	private String name;
	private String company;
	private String age;
	private boolean checked;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	@Override
	public String toString() {
		return "Info [name=" + name + ", company=" + company + ", age=" + age
				+ ", checked=" + checked + "]";
	}
	
}
