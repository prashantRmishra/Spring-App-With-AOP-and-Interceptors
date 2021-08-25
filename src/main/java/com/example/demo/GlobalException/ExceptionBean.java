package com.example.demo.GlobalException;
import java.util.Date;

public class ExceptionBean {
    private Date date;
    private String msg;
    private String des;
    public ExceptionBean(Date date,String msg,String des){
        this.date=date;
        this.msg = msg;
        this.des = des;
    }
	public Date getdate() {
		return this.date;
	}

	public void setdate(Date date) {
		this.date = date;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}
