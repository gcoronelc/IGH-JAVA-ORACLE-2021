package com.igh.app03.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaService {
	
	public List<Map<String,Integer>> tablaMultiplicar(int numero){
		List<Map<String,Integer>> tabla = new ArrayList();
		for(int i=1; i<=12; i++) {
			Map<String,Integer> row = new HashMap<>();
			row.put("col1", numero);
			row.put("col2", i);
			row.put("col3", numero*i);
			tabla.add(row);
		}
		return tabla;
	}

}
