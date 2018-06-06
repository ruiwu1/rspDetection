package com.iursp.domain.model;

public class User {
	
	private String refid;//唯一标识
	private String loginId; //登录id
	private String userName; //用户名
	private String userPosition;//简介
	private String userPassword;//密码
	private String sex;//性别
	private String nickName;//昵称
	private String telephone;//手机号码
	private String userLocation;//地址
	private String email;//电邮
	private String idCardPath;//身份证
	private String headIcon;//头像
	private String weixinNo;//微信标识
	
	public String getRefid() {
		return refid;
	}
	public void setRefid(String refid) {
		this.refid = refid;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPosition() {
		return userPosition;
	}
	public void setUserPosition(String userPosition) {
		this.userPosition = userPosition;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUserLocation() {
		return userLocation;
	}
	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIdCardPath() {
		return idCardPath;
	}
	public void setIdCardPath(String idCardPath) {
		this.idCardPath = idCardPath;
	}
	public String getHeadIcon() {
		return headIcon;
	}
	public void setHeadIcon(String headIcon) {
		this.headIcon = headIcon;
	}
	public String getWeixinNo() {
		return weixinNo;
	}
	public void setWeixinNo(String weixinNo) {
		this.weixinNo = weixinNo;
	}

}

