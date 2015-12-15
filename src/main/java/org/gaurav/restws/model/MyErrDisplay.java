package org.gaurav.restws.model;

import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MyErrDisplay {
	private Status errCode;

	private String errMsg;

	public MyErrDisplay() {
		super();
	}

	public MyErrDisplay(Status errCode, String errMsg) {
		super();
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public Status getErrCode() {
		return errCode;
	}

	public void setErrCode(Status errCode) {
		this.errCode = errCode;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
