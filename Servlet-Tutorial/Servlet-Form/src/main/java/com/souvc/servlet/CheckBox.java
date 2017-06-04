package com.souvc.servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 将复选框数据传递到 Servlet 程序
 */
//@WebServlet("/CheckBox")
public class CheckBox extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String title = "读取复选框数据";
		String docType = "<!DOCTYPE html> \n";
			out.println(docType +
	            "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor=\"#f0f0f0\">\n" +
	            "<h1 align=\"center\">" + title + "</h1>\n" +
	            "<ul>\n" +
	            "  <li><b>souvc标识：</b>: "
	            + request.getParameter("souvc") + "\n" +
	            "  <li><b>Google 标识：</b>: "
	            + request.getParameter("google") + "\n" +
	            "  <li><b>淘宝标识：</b>: "
	            + request.getParameter("taobao") + "\n" +
	            "</ul>\n" +
	            "</body></html>");
	}
	
	// 处理 POST 方法请求的方法
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}