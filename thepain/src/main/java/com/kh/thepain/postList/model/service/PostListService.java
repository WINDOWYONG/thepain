package com.kh.thepain.postList.model.service;

import java.util.ArrayList;

import com.kh.thepain.common.model.vo.PageInfo;
import com.kh.thepain.postList.model.vo.PostList;

import oracle.jdbc.proxy.annotation.Post;

public interface PostListService {
	
	// 1. 채용공고 리스트 페이지 서비스 (페이징)
	int PostListCount();
	ArrayList<PostList> selectList(PageInfo pi);
	
	
	
	
}