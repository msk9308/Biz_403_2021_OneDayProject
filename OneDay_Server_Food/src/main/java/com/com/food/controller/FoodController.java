package com.com.food.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.com.food.model.FoodDTO;
import com.com.food.service.FoodService;
import com.com.food.service.impl.FoodServiceImplV1;

@ WebServlet("/")
public class FoodController extends HttpServlet {
	
	private FoodService fService;
	
	public FoodController() {
		fService = new FoodServiceImplV1();
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<FoodDTO> foodlist = fService.selectAll();
		req.setAttribute("FDLIST", foodlist);
		req.getRequestDispatcher("/WEB-INF/views/food.jsp").forward(req, resp);
		
		
		
		
		
		
		
		
		
		
		
		
//		resp.setContentType("text/html;charset=UTF-8");
//		PrintWriter out = resp.getWriter();
//		String subPath = req.getPathInfo();
//		
//		if(subPath.equals("/select")) {
//			List<FoodDTO> foodList = fService.selectAll();
//			out.println(foodList.toString());
//		}else {
//			
//		}
//		out.println(subPath);
//		out.close();
//					
	}
	
	private void selectAll() {
		List<FoodDTO> foodList = fService.selectAll();
		PrintWriter out = null;
		for(FoodDTO dto : foodList) {
			out.print("<p>");
			out.print(dto.getF_ccode());
			out.print(dto.getF_dcode());
			out.print(dto.getF_fcode());
			out.print(dto.getF_name());
			out.print(dto.getF_since());
			out.print(dto.getF_dan());
			out.print(dto.getF_dang());
			out.print(dto.getF_ji());
			out.print(dto.getF_kcal());
			out.print(dto.getF_one());
			out.print(dto.getF_tan());
			out.print(dto.getF_total());
		}
		out.close();
		
		
	}

	

}
