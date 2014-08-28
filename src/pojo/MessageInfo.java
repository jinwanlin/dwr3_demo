package pojo;

import java.io.Serializable;

public class MessageInfo implements Serializable {
	private String msg;

	public MessageInfo() {
	}

	public MessageInfo(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
