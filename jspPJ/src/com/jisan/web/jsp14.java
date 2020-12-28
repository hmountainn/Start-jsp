package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;

@WebServlet("/jsp14")
public class jsp14 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8로 보내겠다
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		
		PrintWriter out = resp.getWriter();
		
		for(int i=0; i<100; i++) {
		out.println((i+1)+": 안녕 servlet<br/>");
		
		}
	}
}
