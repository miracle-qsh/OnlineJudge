package com.newoj.bean;

public class Student {
    private Integer stuId;

    private String stuUsername;

    private String stuPassword;

    private String stuName;

    private Integer stuSloveed;

    private String stuEmail;
    
    

    public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String stuUsername, String stuPassword, String stuName, Integer stuSloveed,
			String stuEmail) {
		super();
		this.stuId = stuId;
		this.stuUsername = stuUsername;
		this.stuPassword = stuPassword;
		this.stuName = stuName;
		this.stuSloveed = stuSloveed;
		this.stuEmail = stuEmail;
	}

	public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuUsername() {
        return stuUsername;
    }

    public void setStuUsername(String stuUsername) {
        this.stuUsername = stuUsername == null ? null : stuUsername.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuSloveed() {
        return stuSloveed;
    }

    public void setStuSloveed(Integer stuSloveed) {
        this.stuSloveed = stuSloveed;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail == null ? null : stuEmail.trim();
    }
}