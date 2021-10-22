package com.example.web22.utils;

public class ResultMsg<T> {
	private int state;
	private String msg;
	private T datas;
	public ResultMsg(int state,String msg){
		this.state = state;
		this.msg = msg;
	}
	public ResultMsg(int state,String msg,T datas){
		this.state = state;
		this.msg = msg;
		this.datas = datas;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getDatas() {
		return datas;
	}
	public void setDatas(T datas) {
		this.datas = datas;
	}
}
