package org.gaurav.restws.database;

import java.util.HashMap;
import java.util.Map;

import org.gaurav.restws.vo.CustomerVO;
import org.gaurav.restws.vo.ItemVO;

public class Database {
		private static Map<Long, ItemVO> items = new HashMap<>();
		private static Map<Long, CustomerVO> customers = new HashMap<>();

		public static Map<Long, CustomerVO> getCustomers() {
			return customers;
		}


		public static Map<Long, ItemVO> getItems() {
			return items;
		}


		
	}
		
