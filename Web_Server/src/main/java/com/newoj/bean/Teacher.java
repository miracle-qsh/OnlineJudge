package com.newoj.bean;

public class Teacher {
    private Integer teaId;

    private String teaUsername;

    private String teaPassword;

    private String teaName;

    private String teaEmail;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaUsername() {
        return teaUsername;
    }

    public void setTeaUsername(String teaUsername) {
        this.teaUsername = teaUsername == null ? null : teaUsername.trim();
    }

    public String getTeaPassword() {
        return teaPassword;
    }

    public void setTeaPassword(String teaPassword) {
        this.teaPassword = teaPassword == null ? null : teaPassword.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    public String getTeaEmail() {
        return teaEmail;
    }

    public void setTeaEmail(String teaEmail) {
        this.teaEmail = teaEmail == null ? null : teaEmail.trim();
    }
}