package com.com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.FoodVO;
import com.com.food.service.FoodService;
import com.com.food.service.impl.FoodServiceImplV1;

@ WebServlet("/product/*")
public class FoodController extends HttpServlet {
	
	private FoodService fService;
	
	public FoodController() {
		fService = new FoodServiceImplV1();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String subPath = req.getPathInfo();
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();

		
		
		
		
		
				
	}

	
	

}
