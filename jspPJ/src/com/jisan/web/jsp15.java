package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

@WebServlet("/jsp15")
public class jsp15 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8로 보내겠다
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		
		PrintWriter out = resp.getWriter();
		
		int cnt = Integer.parseInt(req.getParameter("cnt")); //cnt값을 사용자에게 받자
		
		for(int i=0; i<cnt; i++) {
		out.println((i+1)+": 안녕 servlet<br/>");
		
		}
	}
}
