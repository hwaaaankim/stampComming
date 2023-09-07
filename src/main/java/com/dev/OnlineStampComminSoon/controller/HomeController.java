package com.dev.OnlineStampComminSoon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.OnlineStampComminSoon.model.EventParticipant;
import com.dev.OnlineStampComminSoon.service.EventParticipantService;

@Controller
public class HomeController {

	@Autowired
	EventParticipantService eventParticipantService;
	
	@RequestMapping({"/index", ""})
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/eventParticipant")
	@ResponseBody
	public String eventParicipant(EventParticipant eventParticipant) {
		System.out.println("123");
		eventParticipantService.eventInsert(eventParticipant);
		
		StringBuffer sb = new StringBuffer();
		String msg = "이벤트 신청이 완료 되었습니다.";

		sb.append("alert('" + msg + "');");
		sb.append("location.href='/index'");
		sb.append("</script>");
		sb.insert(0, "<script>");

		return sb.toString();
		
	}
	
	@RequestMapping("/privacy")
	public String privacy() {
		
		return "privacy";
	}
}
