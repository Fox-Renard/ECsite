package jp.co.internous.ecsite.model.dao;

import java.io.Serializable;

public class HistoryForm implements Serializable{
	private static final long serialVersionUID = 1L;

	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
