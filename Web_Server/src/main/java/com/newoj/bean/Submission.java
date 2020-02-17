package com.newoj.bean;

import java.util.Date;

public class Submission {
    private Integer subId;

    private Integer stuId;

    private Integer proId;

    private String result;

    private Date subTime;

    private Integer time;

    private Integer mem;

    private Integer length;
    
    

    public Submission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Submission(Integer subId, Integer stuId, Integer proId, String result, Date subTime, Integer time,
			Integer mem, Integer length) {
		super();
		this.subId = subId;
		this.stuId = stuId;
		this.proId = proId;
		this.result = result;
		this.subTime = subTime;
		this.time = time;
		this.mem = mem;
		this.length = length;
	}

	public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getSubTime() {
        return subTime;
    }

    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}