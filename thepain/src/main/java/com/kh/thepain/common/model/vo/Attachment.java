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
public class Attachment {

	private int fileNo;
	private int memberNo;
	private String fileOriginName;
	private String fileEditName;
	private String fileRoot;
	private String fileType;
	private int recruitmentNo;
}
