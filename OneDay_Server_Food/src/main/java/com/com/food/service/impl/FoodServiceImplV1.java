package com.com.food.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.com.food.model.FoodDTO;
import com.com.food.model.FoodVO;
import com.com.food.service.DBContract;
import com.com.food.service.FoodService;

public class FoodServiceImplV1 implements FoodService {
	
	protected Connection dbConn;
	public FoodServiceImplV1() {
		this.dbConn = DBContract.getDBConnection();
	}
	
	@Override
	public void insert(FoodVO foodVO) {
		
		String sql = " INSERT INTO "
				+ "tbl_myfoods";
		sql += " ( m_seq"
				+ "    m_date"
				+ "    m_fcode"
				+ "    m_qty";
		sql += " VALUES(?,?,?,?)";
		System.out.println(sql);
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setInt(1,foodVO.getM_seq());
			pStr.setString(2,foodVO.getM_date());
			pStr.setString(3,foodVO.getM_fcode());
			pStr.setString(4,foodVO.getM_qty());
			
			pStr.executeUpdate();
			pStr.close();
			System.out.println("InsertOK");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<FoodDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO findById(String m_date) {
		String sql = " SELECT * FROM view_ 식품정보";
		sql += " WHERE DATE = ?";
		
		PreparedStatement pStr = null;
		
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, m_date.trim());
			ResultSet result = pStr.executeQuery();	
			
			if(result.next()) {
				FoodDTO foodDTO = new FoodDTO();
				foodDTO.setF_name(result.getString("식품명"));
				foodDTO.setF_one(result.getInt(""));
				foodDTO.setF_total(result.getInt(""));
				foodDTO.setF_kcal(result.getInt(""));
				foodDTO.setF_dan(result.getInt(""));
				foodDTO.setF_ji(result.getInt(""));
				foodDTO.setF_tan(result.getInt(""));
				foodDTO.setF_dang(result.getInt(""));
				return foodDTO;
			}else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
