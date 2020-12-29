package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice")
public class jsp19 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); //UTF-8로 보내겠다
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		
		PrintWriter out = resp.getWriter();
		
		String title = req.getParameter("title");  //이름이 title에서 받기
		String content = req.getParameter("content"); //이름이 content에서 받기
		
		out.println(title);
		out.println(content);
		
		
	}
}
