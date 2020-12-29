package com.jisan.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/homework")
public class homework21 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("UTF-8"); // UTF-8로 응답보낼게
		resp.setContentType("Text/html; charset=UTF-8"); //UTF-8로 받아라
		
		int x = Integer.parseInt(req.getParameter("x")); //x값 받기
		int y = Integer.parseInt(req.getParameter("y")); //y값 받기
		int sum = x+y;
		
		PrintWriter out = resp.getWriter();
		out.println("합은 "+sum);
	}
}
