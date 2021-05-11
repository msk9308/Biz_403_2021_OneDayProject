package com.com.food.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {
    private String f_fcode; //CHAR(7) PRIMARY KEY,
    private String f_name; //nVARCHAR2(50) NOT NULL,
    private String f_since;	//CHAR(4) NOT NULL,
    private String f_ccode;	//CHAR(6)	NOT NULL,
    private String f_dcode;	//CHAR(4)	NOT NULL,	
    private Integer f_one;	//NUMBER	NOT NULL,	
    private Integer f_total;	//NUMBER,		
    private Integer f_kcal;	//NUMBER,		
    private Integer f_dan;	//NUMBER,		
    private Integer f_ji;	//NUMBER,		
    private Integer f_tan;	//NUMBER,		
    private Integer f_dang;	//NUMBER

}
