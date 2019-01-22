package com.oa.pojo;

/**
 * 通讯录表
 * 
 * @author PangMinHui
 *
 */
public class Addressclass {
	private Integer id;
	private String classname;
	private Integer userid;

	public Addressclass() {
		super();
	}

	public Addressclass(Integer id, String classname, Integer userid) {
		super();
		this.id = id;
		this.classname = classname;
		this.userid = userid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

}
