package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

@WebServlet("/jsp16")
public class jsp16 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8로 보내겠다
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		
		PrintWriter out = resp.getWriter();
		
		String cnt_ = req.getParameter("cnt"); //cnt값 쿼리스트링 이용해서 사용자에게 받자
		
		int cnt = 10; //기본값
		if(cnt_ !=null && !cnt_.equals("")) {  //쿼리스트링으로 입력받으면 그값으로 하자
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0; i<cnt; i++) {
		out.println((i+1)+": 안녕 servlet<br/>");
		
		}
	}
}
