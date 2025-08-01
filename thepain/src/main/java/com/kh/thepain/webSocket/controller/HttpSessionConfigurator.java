package com.kh.thepain.webSocket.controller;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

import com.kh.thepain.member.model.vo.Member;

public class HttpSessionConfigurator extends ServerEndpointConfig.Configurator {

	@Override
	public void modifyHandshake(ServerEndpointConfig config,
	                            HandshakeRequest request,
	                            HandshakeResponse response) {
	    HttpSession httpSession = (HttpSession) request.getHttpSession();
	    if (httpSession != null) {
	        Member loginMember = (Member) httpSession.getAttribute("loginMember");
	        if (loginMember != null) {
	            config.getUserProperties().put("memberNo", loginMember.getMemberNo());
	            return;
	        }
	    }

	  
	}}
