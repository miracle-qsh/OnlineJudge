package com.newoj.bean;

public class ContestMap {
    private Integer mapId;

    private Integer proId;

    private Integer conId;

    
    
    public ContestMap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContestMap(Integer mapId, Integer proId, Integer conId) {
		super();
		this.mapId = mapId;
		this.proId = proId;
		this.conId = conId;
	}

	public Integer getMapId() {
        return mapId;
    }

    public void setMapId(Integer mapId) {
        this.mapId = mapId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }
}