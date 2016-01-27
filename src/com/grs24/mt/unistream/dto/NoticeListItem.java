package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class NoticeListItem 
{
	/** Идентификатор уведомления */
	private Integer NoticeID;

	/** Статус уведомления */
	private NoticeStatus NoticeStatus;

	public NoticeListItem() {
	}

	public Integer getNoticeID() {
		return NoticeID;
	}

	public void setNoticeID(Integer NoticeID) {
		this.NoticeID = NoticeID;
	}

	public NoticeStatus getNoticeStatus() {
		return NoticeStatus;
	}

	public void setNoticeStatus(NoticeStatus NoticeStatus) {
		this.NoticeStatus = NoticeStatus;
	}

	@Override
	public String toString() {
		return "NoticeListItem{" + "NoticeID=" + NoticeID + ", NoticeStatus=" + NoticeStatus + '}';
	}
}
