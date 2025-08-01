package com.kh.thepain.common.model.vo;

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
public class Email {
	private String subject;
	private String content;
	private String receptionEmail;
	private String senderEmail;
}
