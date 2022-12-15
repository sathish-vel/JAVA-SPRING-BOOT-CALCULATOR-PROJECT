package com.example.calculator.service;

import org.springframework.stereotype.Service;

import com.example.calculator.Dao.CalcDao;
import com.example.calculator.Dao.DaoImpl;

@Service
public class CalcService {
	public int testDiv(int x, int y) {
		CalcDao c = new DaoImpl();
		return c.divNo(x, y);
	}

}
