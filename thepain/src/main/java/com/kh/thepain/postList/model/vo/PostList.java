package com.kh.thepain.postList.model.vo;

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
public class PostList {
	
	//job_post vo
	private int recruitmentNo;
	private int memberNo;
	private int enterpriseNo;
	private Date recruitmentDate;
	private int count;
	
	// job_wirte_post vo
	private boolean jjim;
	private String companyName;
	private String hireType;
	private int salaryMin;
	private int salaryMax;
	private String description;
	private String duty;
	private String benefits;
	private String status;
	private String title;
	private Date deadLine;
}
