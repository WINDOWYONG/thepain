package com.kh.thepain.jjim.model.service;

import java.util.ArrayList;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.thepain.jjim.model.dao.JjimDao;
import com.kh.thepain.postList.model.vo.PostList;
import com.kh.thepain.postList.model.vo.PostWrite;

@Service
public class JjimService {

    @Autowired
    private JjimDao jDao;

    @Autowired
    private SqlSessionTemplate sqlSession;

    public boolean isAlreadyJjim(int memberNo, int postNo) {
        return jDao.isAlreadyJjim(sqlSession, memberNo, postNo) > 0;
    }

    public int addJjim(int memberNo, int postNo) {
        return jDao.addJjim(sqlSession, memberNo, postNo);
    }

    public int removeJjim(int memberNo, int postNo) {
        return jDao.removeJjim(sqlSession, memberNo, postNo);
    }
    public ArrayList<PostList> selectJjimList(int memberNo) {
        return jDao.selectJjimList(sqlSession, memberNo);
    }
    public ArrayList<Integer> jjimListByMember(int memberNo) {
        return jDao.selectJjimPostNos(sqlSession, memberNo);
    }


}