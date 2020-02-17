package com.newoj.bean;

import java.util.Date;

public class Contest {
    private Integer conId;

    private String conName;

    private Date conStarttime;

    private Date conEndtime;

    
    
    
    public Contest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contest(Integer conId, String conName, Date conStarttime, Date conEndtime) {
		super();
		this.conId = conId;
		this.conName = conName;
		this.conStarttime = conStarttime;
		this.conEndtime = conEndtime;
	}

	public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName == null ? null : conName.trim();
    }

    public Date getConStarttime() {
        return conStarttime;
    }

    public void setConStarttime(Date conStarttime) {
        this.conStarttime = conStarttime;
    }

    public Date getConEndtime() {
        return conEndtime;
    }

    public void setConEndtime(Date conEndtime) {
        this.conEndtime = conEndtime;
    }
}