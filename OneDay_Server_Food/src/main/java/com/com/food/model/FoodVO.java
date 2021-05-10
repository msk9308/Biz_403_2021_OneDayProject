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
public class FoodVO {
    private Integer m_seq;// NUMBER PRIMARY KEY,
    private String m_date;// VARCHAR2(15) NOT NULL,
    private String m_fcode;// CHAR(7) NOT NULL,
    private String m_qty;// CHAR(1) NOT NULL
}
