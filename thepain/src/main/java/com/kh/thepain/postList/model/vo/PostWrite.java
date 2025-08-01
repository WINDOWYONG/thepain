package com.kh.thepain.postList.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PostWrite {

	private int postNo;
	private String companyName;
	private int memberNo;
	private String hireType;
	private int salaryMin;
	private int salaryMax;
	private String description;
	private String duty;
	private String benefits;
	private String status;
	private boolean jjim;
	private String title;
	private Date deadLine;
}
