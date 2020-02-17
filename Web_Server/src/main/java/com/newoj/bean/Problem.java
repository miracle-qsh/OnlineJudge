package com.newoj.bean;

public class Problem {
    private Integer proId;

    private String proTitle;

    private Integer proTimelim;

    private Integer proMemlim;

    private String proInfo;

    private String proInput;

    private String proOutput;

    private String proSinput;

    private String proSoutput;

    private String proHint;

    private Integer proAuthorid;

    private Integer proAcnum;

    private Integer proTotalnum;

    private String proData;

    
    
    public Problem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Problem(Integer proId, String proTitle, Integer proTimelim, Integer proMemlim, String proInfo,
			String proInput, String proOutput, String proSinput, String proSoutput, String proHint, Integer proAuthorid,
			Integer proAcnum, Integer proTotalnum, String proData) {
		super();
		this.proId = proId;
		this.proTitle = proTitle;
		this.proTimelim = proTimelim;
		this.proMemlim = proMemlim;
		this.proInfo = proInfo;
		this.proInput = proInput;
		this.proOutput = proOutput;
		this.proSinput = proSinput;
		this.proSoutput = proSoutput;
		this.proHint = proHint;
		this.proAuthorid = proAuthorid;
		this.proAcnum = proAcnum;
		this.proTotalnum = proTotalnum;
		this.proData = proData;
	}

	public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProTitle() {
        return proTitle;
    }

    public void setProTitle(String proTitle) {
        this.proTitle = proTitle == null ? null : proTitle.trim();
    }

    public Integer getProTimelim() {
        return proTimelim;
    }

    public void setProTimelim(Integer proTimelim) {
        this.proTimelim = proTimelim;
    }

    public Integer getProMemlim() {
        return proMemlim;
    }

    public void setProMemlim(Integer proMemlim) {
        this.proMemlim = proMemlim;
    }

    public String getProInfo() {
        return proInfo;
    }

    public void setProInfo(String proInfo) {
        this.proInfo = proInfo == null ? null : proInfo.trim();
    }

    public String getProInput() {
        return proInput;
    }

    public void setProInput(String proInput) {
        this.proInput = proInput == null ? null : proInput.trim();
    }

    public String getProOutput() {
        return proOutput;
    }

    public void setProOutput(String proOutput) {
        this.proOutput = proOutput == null ? null : proOutput.trim();
    }

    public String getProSinput() {
        return proSinput;
    }

    public void setProSinput(String proSinput) {
        this.proSinput = proSinput == null ? null : proSinput.trim();
    }

    public String getProSoutput() {
        return proSoutput;
    }

    public void setProSoutput(String proSoutput) {
        this.proSoutput = proSoutput == null ? null : proSoutput.trim();
    }

    public String getProHint() {
        return proHint;
    }

    public void setProHint(String proHint) {
        this.proHint = proHint == null ? null : proHint.trim();
    }

    public Integer getProAuthorid() {
        return proAuthorid;
    }

    public void setProAuthorid(Integer proAuthorid) {
        this.proAuthorid = proAuthorid;
    }

    public Integer getProAcnum() {
        return proAcnum;
    }

    public void setProAcnum(Integer proAcnum) {
        this.proAcnum = proAcnum;
    }

    public Integer getProTotalnum() {
        return proTotalnum;
    }

    public void setProTotalnum(Integer proTotalnum) {
        this.proTotalnum = proTotalnum;
    }

    public String getProData() {
        return proData;
    }

    public void setProData(String proData) {
        this.proData = proData == null ? null : proData.trim();
    }
}