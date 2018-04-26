package com.cg.bank.customer;

import java.util.Date;

/**
 * @author arjawast
 * Statement class is having attributes remark ,date,and user Id
 */
public class Statement {

	private String remark;
	private Date date;
	private String c;
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public Statement(String remark, Date date, String c) {
		super();
		this.remark = remark;
		this.date = date;
		this.c = c;
	}
	
}
