package com.grs24.mt.unistream.dto;

import java.util.Date;

/**
 *
 * @author Ctac
 */
public class UserActionInfo {
	
	/** Местное время проведения операции */
	private Date ActionLocalDateTime;
	
	/** Идентификатор пользователя в системе партнёра */
	private Integer UserID;

	/** Номер карты Юнистрим пользователя */
	private String UserUnistreamCard;

	public UserActionInfo() {
	}

	public Date getActionLocalDateTime() {
		return ActionLocalDateTime;
	}

	public void setActionLocalDateTime(Date ActionLocalDateTime) {
		this.ActionLocalDateTime = ActionLocalDateTime;
	}

	public Integer getUserID() {
		return UserID;
	}

	public void setUserID(Integer UserID) {
		this.UserID = UserID;
	}

	public String getUserUnistreamCard() {
		return UserUnistreamCard;
	}

	public void setUserUnistreamCard(String UserUnistreamCard) {
		this.UserUnistreamCard = UserUnistreamCard;
	}

	@Override
	public String toString() {
		return "UserActionInfo{" + "ActionLocalDateTime=" + ActionLocalDateTime + ", UserID=" + UserID + ", UserUnistreamCard=" + UserUnistreamCard + '}';
	}
}
