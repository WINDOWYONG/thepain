package com.kh.thepain.webSocket.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class AlarmHistory {
	
	private int alarmHistoryNo;
	private int alarmNo;
	private int receiverNo;
	private int senderNo;
	private String alarmHistoryContent;
	private Date createDate;
	
}
