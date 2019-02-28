package com.mymooc.common.vo;

public class JsonResult {

	private static final long serialVersionUID = -1014451606124102865L;

	// 状态码
	private int state = 1; 
	// 状态信息
	private String message="OK";
	// 正确数据
	private Object data;
	
	public JsonResult() {
		super();
	}

	public JsonResult(String message) {
		this.message = message;
	}

	public JsonResult(Object data) {
		super();
		this.data = data;
	}

	public JsonResult(Throwable e) {
		this.state = 0;
		this.message = e.getMessage();
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
