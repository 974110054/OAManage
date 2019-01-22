package com.oa.pojo;
/**
 * 用户信息表
 * @author PangMinHui
 *
 */
public class Userinfo {
    private String userid;
	private String username;
	private String userpwd;
	private String departmentid;
	private String itemid;
	private String purviewstr;
	private String userlogin;
	private String state;
	private String dutyid;
	
	public Userinfo() {
		super();
	}
	public Userinfo(String userid, String username, String userpwd, String departmentid, String itemid,
			String purviewstr, String userlogin, String state, String dutyid) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpwd = userpwd;
		this.departmentid = departmentid;
		this.itemid = itemid;
		this.purviewstr = purviewstr;
		this.userlogin = userlogin;
		this.state = state;
		this.dutyid = dutyid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	public String getItemid() {
		return itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}
	public String getPurviewstr() {
		return purviewstr;
	}
	public void setPurviewstr(String purviewstr) {
		this.purviewstr = purviewstr;
	}
	public String getUserlogin() {
		return userlogin;
	}
	public void setUserlogin(String userlogin) {
		this.userlogin = userlogin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDutyid() {
		return dutyid;
	}
	public void setDutyid(String dutyid) {
		this.dutyid = dutyid;
	}
	
}
